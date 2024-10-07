package main;

import java.util.ArrayList;

public class Gifu {
    ArrayList<Course> courses;
    ArrayList<Student> students;
    ArrayList<Enrollment> enrollments;

    public Gifu() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getStudentId() + " - " + student.getName());
        }
    }

    public Student getStudents(String studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public Course getCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println(course.getCourseId() + " - " + course.getCourseName());
        }
    }

    public void addStudentToCourse(String courseId, Student student) {
        Course course = getCourse(courseId);
            if (course != null) {
                course.addStudent(student);
            } else {
                System.out.println("Kurssia ei löytynyt.");
            }
    }

    public void enrollStudent(Student student, Course course, int grade) {
        Enrollment enrollment = new Enrollment(grade, student, course);
        enrollments.add(enrollment);
    }

    public ArrayList<Enrollment> getEnrollments(Course course) {
        ArrayList<Enrollment> courseEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse().equals(course)) {
                courseEnrollments.add(enrollment);
            }
        }
        return courseEnrollments;
    }

    public ArrayList<Enrollment> getEnrollments(Student student) {
        ArrayList<Enrollment> studentEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student)) {
                studentEnrollments.add(enrollment);
            }
        }
        return studentEnrollments;
    }

    
}

