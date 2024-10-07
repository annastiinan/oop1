package main;

public class Course {
    private int maxNumberOfStudents;
    private String courseName;
    private String courseId;

    public Course(String courseName, String courseId, int maxNumberOfStudents) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    //set
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    
    //get
    public String getCourseName() {
        return courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    
    
}