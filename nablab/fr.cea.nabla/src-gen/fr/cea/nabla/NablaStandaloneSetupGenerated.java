/*
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.cea.nabla.nabla.NablaPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class NablaStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new NablaRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.cea.fr/nabla/Nabla")) {
			EPackage.Registry.INSTANCE.put("http://www.cea.fr/nabla/Nabla", NablaPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("nabla", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("nabla", serviceProvider);
	}
}
