package server.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserEndpoint {

    @GET
    public Respoense getUserProfile() {
        return Response.status(200).entity("users!!").build();
    }

}
