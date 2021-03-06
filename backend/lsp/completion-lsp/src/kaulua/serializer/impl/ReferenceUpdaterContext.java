/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.serializer.impl;

import java.util.List;

import org.eclipse.xtext.formatting2.regionaccess.ITextRegionDiffBuilder;
import kaulua.serializer.hooks.IReferenceUpdaterContext;
import kaulua.serializer.hooks.IUpdatableReference;
import kaulua.serializer.impl.EObjectDescriptionDeltaProvider.Deltas;
import kaulua.serializer.impl.RelatedResourcesProvider.RelatedResource;
import org.eclipse.xtext.resource.XtextResource;

import com.google.common.collect.Lists;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class ReferenceUpdaterContext implements IReferenceUpdaterContext {

	private final Deltas deltas;
	private final ITextRegionDiffBuilder diffBuilder;
	private final List<Runnable> handler = Lists.newArrayList();
	private final List<IUpdatableReference> references = Lists.newArrayList();
	private final RelatedResource relatedResource;

	public ReferenceUpdaterContext(Deltas deltas, ITextRegionDiffBuilder diffBuilder) {
		super();
		this.deltas = deltas;
		this.diffBuilder = diffBuilder;
		this.relatedResource = null;
	}

	public ReferenceUpdaterContext(Deltas deltas, ITextRegionDiffBuilder diffBuilder, RelatedResource relatedResource) {
		this.deltas = deltas;
		this.diffBuilder = diffBuilder;
		this.relatedResource = relatedResource;
	}

	@Override
	public Deltas getEObjectDescriptionDeltas() {
		return deltas;
	}

	protected List<Runnable> getModifications() {
		return handler;
	}

	@Override
	public ITextRegionDiffBuilder getModifyableDocument() {
		return this.diffBuilder;
	}

	@Override
	public RelatedResource getRelatedResource() {
		return relatedResource;
	}

	@Override
	public XtextResource getResource() {
		return diffBuilder.getOriginalTextRegionAccess().getResource();
	}

	@Override
	public List<IUpdatableReference> getUpdatableReferences() {
		return references;
	}

	@Override
	public void modifyModel(Runnable runnable) {
		handler.add(runnable);
	}

	@Override
	public void updateReference(IUpdatableReference updatableReference) {
		references.add(updatableReference);
	}

}
