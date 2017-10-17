package server.endpoints;

import com.google.gson.Gson;
import server.models.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/user")


public class UserEndpoint {

    @GET
    public Response get() {
        System.out.println("hallo!");

        return Response.status(200).entity("User").build();

    }

}