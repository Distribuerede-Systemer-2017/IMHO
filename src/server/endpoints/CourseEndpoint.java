package server.endpoints;

import com.google.gson.Gson;
import server.dbmanager.dbmanager1;
import server.models.Course;
//import server.Utility.Digester;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import server.dbmanager.dbmanager3;

@Path("/courses")
public class CourseEndpoint {

    dbmanager3 dbmanager = new dbmanager3();

    @GET
    public Response loadCourses (){
        ArrayList<Course> courses = dbmanager.loadCourses();

        return Response.status(200).entity(new Gson().toJson(courses)).build();

    }

}