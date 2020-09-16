/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.serializer.hooks;

import org.eclipse.xtext.formatting2.regionaccess.ITextRegionDiffBuilder;
import kaulua.serializer.impl.EObjectDescriptionDeltaProvider.Deltas;
import kaulua.serializer.impl.ReferenceUpdater;
import kaulua.serializer.impl.RelatedResourcesProvider.RelatedResource;

import com.google.inject.ImplementedBy;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@ImplementedBy(ReferenceUpdater.class)
public interface IReferenceUpdater {

	boolean isAffected(Deltas deltas, RelatedResource resource);

	void update(IReferenceUpdaterContext context);

	void updateReference(ITextRegionDiffBuilder rewriter, IUpdatableReference updatable);
}
