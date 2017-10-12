package Models;

public class Course {

    private int idCourse;
    private String courseTitle;

    public Course(int idCourse, String courseTitle) {
        this.idCourse = idCourse;
        this.courseTitle = courseTitle;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;

    }
}
