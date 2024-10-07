package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class University implements Serializable {

    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findStudent(String studentNumber) {
        for (Student student : students) {
            if (student.getStudentNumber().equals(studentNumber)) {
                return student;
            }
        }
        return null;
    }

    public void saveFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("university_data.ser"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            System.out.println("Tallennuksessa tapahtui virhe: " + e.getMessage());
        }
    }

    public static University loadFile() {
        University university = null;

        File file = new File("university_data.ser");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                university = (University) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Latauksessa tapahtui virhe: " + e.getMessage());
            }
        }

        return university != null ? university : new University();
    }
}