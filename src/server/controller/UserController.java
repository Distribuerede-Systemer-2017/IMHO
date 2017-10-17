package server.controller;

import server.models.Course;
import server.resetdatabase.ResetDatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserController {


    private ResetDatabase resetdatabase;


    public UserController() {
        this.resetdatabase = resetdatabase;
    }



    public ArrayList<Course> loadCourses() {   //loadCourses
        ResultSet resultSet = null;
        ArrayList<Course> courses = new ArrayList<Course>();
        try {
            PreparedStatement loadCourse = resetdatabase.getConnection(false)
                    .prepareStatement("SELECT * FROM Course");
            resultSet = loadCourse.executeQuery();

            while(resultSet.next()) {
        }   	    			Course course = new Course();   {
                                course.setName(resultSet.getString("name"));
            	    			course.setUsers_id(resultSet.getInt("users_id"));
}           	    			course.add(course);
            	    		}