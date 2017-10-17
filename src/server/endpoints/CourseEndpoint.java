/*
import com.google.gson.Gson;
import com.sun.tools.internal.ws.processor.model.Response;
import server.dbmanager.dbmanager1;
import server.models.Course;
import server.Utility.Digester;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;


public class CourseEndpoint {

    dbmanager3 dbmanager3 = new dbmanager3();

    @GET
    @Path("/Courses")
    public Response
    public Response loadCourses (){

        ArrayList<Course> courses = dbmanager3.loadCourses();
        System.out.print(courses.size());


        return Response.status(200).entity(new Gson().toJson(courses)).build();

    }

} */