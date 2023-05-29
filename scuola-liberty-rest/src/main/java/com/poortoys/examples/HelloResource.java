package com.poortoys.examples;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import wasdev.scuolaliberty.ejb.SampleStatelessBean;

/**
 * Sample JAX-RS resources.
 *
 */
@Path("hello")
@RequestScoped
public class HelloResource {
    
	
	@EJB
    SampleStatelessBean statelessBean;
	
	
    public HelloResource() {
    	try {
            String lookupName = "java:global/scuola-liberty-ear/scuola-liberty-ejb/SampleEJB";
            statelessBean = (SampleStatelessBean) InitialContext.doLookup(lookupName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
	}


	@GET
    @Path("users/{id}")
    @Produces("application/json")
    public Response getMessage(@PathParam("id") String id) {
    	
    	User usr = new User();
    	usr.setName("Alice");
    	usr.setAge(50);
    	usr.setSurname(statelessBean.hello(Integer.parseInt(id)));
        return Response.ok(usr).build();
    }
    
}
