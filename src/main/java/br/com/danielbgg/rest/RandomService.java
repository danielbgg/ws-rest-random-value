package br.com.danielbgg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/random")
public class RandomService {

	public RandomService() {
	}

	@GET
	@Path("/get")
	@Produces("application/json")
	public boolean request() {
		boolean result = Math.random() < 0.5;
		System.out.println("[RANDOM REST SERVICE] Result of random request: " + result);
		return result;
	}

}