package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private String studentNumber;
    private List<Grade> grades;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grades = new ArrayList<>();
    }

    public void addGrade(String course, int grade) {
        Grade newGrade = new Grade(course, grade);
        grades.add(newGrade);
    }

    public List<Grade> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
 @Override
    public String toString() {
        return studentNumber + ": " + name;
    }
}