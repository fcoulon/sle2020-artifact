package nablab;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class AppLifecycleBean {

	private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");
	
	static kaulua.lsp.api.ICompletion service;
	
	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("completion is starting...");
		getService();
	}

	void onStop(@Observes ShutdownEvent ev) { //
		LOGGER.info("completion is stopping...");
	}
	
	public static kaulua.lsp.api.ICompletion getService() {
		if(service == null) {
			Injector injector = new fr.cea.nabla.NablaStandaloneSetup().createInjectorAndDoEMFRegistration().createChildInjector(new ServiceModule());
			service = injector.getInstance(kaulua.lsp.api.ICompletion.class);
		}
		return service;
	}
}
