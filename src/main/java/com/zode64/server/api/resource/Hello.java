package com.zode64.server.api.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.MediaType;
import java.nio.charset.Charset;
import javax.ws.rs.core.Context;
import com.zode64.server.api.DefaultName;

@Path("/hello")
public class Hello {

    private DefaultName defaultName;

    public Hello(@Context DefaultName defaultName){
	this.defaultName = defaultName;
    }

    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public Response sayIt(){
	return Response.status( Status.OK ).entity(
	    ("Hello " + defaultName.getName()).getBytes( Charset.forName("UTF-8") ) ).build();
    }

}
