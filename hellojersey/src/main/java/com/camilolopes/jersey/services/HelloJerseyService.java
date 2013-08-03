package com.camilolopes.jersey.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloJerseyService {
	@GET
	@Path("/client")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getCliente() {
		Client client = new Client();
		client.setName("Hello World Camilo");
		return client;
	}
}
