package fr.inria.diverse.lsp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface Rename {

	@POST
	@Path("/rename")
	String callService(String message);
	
	@GET
	@Path("/health")
	String check();
	
}
