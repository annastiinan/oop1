package main;

class Enrollment {
    int grade = -1;
    Student student;
    Course course;

    public Enrollment(int grade, Student student, Course course) {
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

    public void gradeCourse(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }
}
