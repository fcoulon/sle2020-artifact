/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.serializer.hooks;

import java.util.List;

import org.eclipse.xtext.formatting2.regionaccess.ITextRegionDiffBuilder;

import kaulua.serializer.impl.EObjectDescriptionDeltaProvider;
import kaulua.serializer.impl.RelatedResourcesProvider;
import kaulua.serializer.impl.EObjectDescriptionDeltaProvider.Deltas;
import kaulua.serializer.impl.RelatedResourcesProvider.RelatedResource;

import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IReferenceUpdaterContext {

	RelatedResource getRelatedResource();

	Deltas getEObjectDescriptionDeltas();

	ITextRegionDiffBuilder getModifyableDocument();

	XtextResource getResource();

	List<IUpdatableReference> getUpdatableReferences();

	void modifyModel(Runnable runnable);

	void updateReference(IUpdatableReference updatableReference);
}