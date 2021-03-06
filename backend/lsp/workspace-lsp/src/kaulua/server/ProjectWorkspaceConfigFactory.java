/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package kaulua.server;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.workspace.FileProjectConfig;
import org.eclipse.xtext.workspace.IWorkspaceConfig;
import org.eclipse.xtext.workspace.WorkspaceConfig;

/**
 * The workspace itself is a single project
 *
 * @author Jan Koehnlein - Initial contribution and API
 * @since 2.11
 */
public class ProjectWorkspaceConfigFactory implements IWorkspaceConfigFactory {
	@Override
	public IWorkspaceConfig getWorkspaceConfig(URI workspaceBaseURI) {
		WorkspaceConfig workspaceConfig = new WorkspaceConfig();
		findProjects(workspaceConfig, workspaceBaseURI);
		return workspaceConfig;
	}

	/**
	 * Find all projects at the given location. By default, only the a single project at the workspace root is created.
	 */
	protected void findProjects(WorkspaceConfig workspaceConfig, URI location) {
		if (location != null) {
			FileProjectConfig project = new FileProjectConfig(location, workspaceConfig);
			project.addSourceFolder(".");
			workspaceConfig.addProject(project);
		}
	}
}
