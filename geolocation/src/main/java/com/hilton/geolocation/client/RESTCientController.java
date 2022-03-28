package com.hilton.geolocation.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hilton.geolocation.resources.LocationDetails;

@Produces(MediaType.TEXT_PLAIN)
@Path("/{query}")
public class RESTCientController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RESTCientController.class);

	private Client client;

	public RESTCientController(Client client) {
		this.client = client;
	}

	@GET

	@Produces(MediaType.APPLICATION_JSON)
	public LocationDetails getDetails(@PathParam("query") String ipAdr) {
		System.out.println("IN GET DETAILS");
		WebTarget wt = client.target("http://ip-api.com/json/" + ipAdr);
		Invocation.Builder ib = wt.request(MediaType.APPLICATION_JSON);
		Response resp = ib.get();
		LOGGER.info("Response Entity :: " + resp.getEntity().toString());

		LocationDetails ld = resp.readEntity(LocationDetails.class);

		// String s = resp.readEntity(String.class);

		return ld;

	}
	 

}
