package main;

public class Student {
    private String name;
    private String studentId;   

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    
}
