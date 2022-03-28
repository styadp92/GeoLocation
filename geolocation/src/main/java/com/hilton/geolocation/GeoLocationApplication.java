package com.hilton.geolocation;

import java.io.IOException;
import javax.ws.rs.client.Client;

import org.glassfish.jersey.client.JerseyClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hilton.geolocation.client.RESTCientController;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class GeoLocationApplication extends Application<Configuration> {

	  private static final Logger LOGGER = LoggerFactory.getLogger(GeoLocationApplication.class);

	
	
    public static void main(final String[] args) throws Exception {
        new GeoLocationApplication().run(args);
    }

    @Override
    public String getName() {
        return "GeoLocation";
    }

    @Override
    public void initialize(final Bootstrap<Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Configuration configuration,
                    final Environment environment) throws IOException {
        // TODO: implement application
    	LOGGER.info("Starting REST Call..");
        
        final Client client = new JerseyClientBuilder().build();
        environment.jersey().register(new RESTCientController(client));
        
        
        //System.out.println("Enter IP Address :: ");
        //BufferedReader reader = new BufferedReader(
        //new InputStreamReader(System.in));
        //String ipAdr = reader.readLine();
        
        //String result = client.target("http://ip-api.com/json/").request("23.115.83.100"+"?fields=57855").get(String.class);
        //System.out.println("Result :: " + result);
        
        //LocationDetails lds = client.target("http://ip-api.com/json/").request(ipAdr).get(LocationDetails.class);
        //System.out.println("City :: " + lds.getCity());
    }

}
