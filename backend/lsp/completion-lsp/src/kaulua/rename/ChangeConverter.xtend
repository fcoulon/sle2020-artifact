/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.rename

import com.google.inject.Inject
import java.io.ByteArrayOutputStream
import java.nio.charset.Charset
import kaulua.common.Document
import kaulua.serializer.IEmfResourceChange
import kaulua.serializer.ITextDocumentChange
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.WorkspaceEdit
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.IAcceptor

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
class ChangeConverter implements IAcceptor<IEmfResourceChange> {

	static class Factory {

		@Inject IResourceServiceProvider.Registry registry

		def ChangeConverter create(Document document, Resource resource, WorkspaceEdit edit) {
			new ChangeConverter(document, resource, registry, edit)
		}
	}

	val IResourceServiceProvider.Registry registry
	val WorkspaceEdit edit
	
	Document document
	Resource resource
	
	protected new(Document document, Resource resource, IResourceServiceProvider.Registry registry, WorkspaceEdit edit) {
		this.registry = registry
		this.edit = edit
		this.document = document
		this.resource = resource
	}

	override accept(IEmfResourceChange change) {
		handleReplacements(change)
	}

	protected def dispatch void handleReplacements(IEmfResourceChange change) {
		val outputStream = new ByteArrayOutputStream
		try {
			val uri = change.resource.URI
			change.resource.save(outputStream, null)
			val newContent = new String(outputStream.toByteArray, change.resource.charset)
			val range = new Range(document.getPosition(0), document.getPosition(document.contents.length))
			val textEdit = new TextEdit(range, newContent)
			addTextEdit(uri, textEdit)
		} finally {
			outputStream.close
		}
	}

	protected def String getCharset(Resource resource) {
		val xtextEncodingProvider = registry.getResourceServiceProvider(resource.URI).get(IEncodingProvider)
		if (xtextEncodingProvider !== null)
			return xtextEncodingProvider.getEncoding(resource.URI)
		else if (resource instanceof XMLResource)
			resource.encoding
		else
			Charset.defaultCharset.toString
	}

	protected def dispatch void handleReplacements(ITextDocumentChange change) {
		if (change.replacements.size > 0) {
			val uri = change.newURI
			val textEdits = change.replacements.map [ replacement |
				val start = document.getPosition(replacement.offset)
				val end = document.getPosition(replacement.offset + replacement.length)
				val range = new Range(start, end)
				new TextEdit(range, replacement.replacementText)
			]
			addTextEdit(uri, textEdits)
		}
	}
	
	protected def addTextEdit(URI uri, TextEdit... textEdit) {
		edit.changes.put(uri.toString, textEdit)
	}
}
