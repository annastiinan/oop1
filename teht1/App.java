package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        University university = new University();

        int choose;

        do {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, " +
                    "4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, " +
                    "6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, " +
                    "8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            try {
                choose = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.NoSuchElementException e) {
                choose = 0;
            }

            switch (choose) {
                case 1:
                    System.out.println("Anna opiskelijan nimi?");
                    String name = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentNumber = scanner.nextLine();

                    Student newStudent = new Student(name, studentNumber);
                    university.addStudent(newStudent);

                    break;

                case 2:
                    System.out.println("Opiskelijat:");
                    List<Student> allStudents = university.getStudents();
                    for (Student student : allStudents) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    List<Student> allStudents2 = university.getStudents();
                    for (int i = 0; i < allStudents2.size(); i++) {
                        System.out.println(i + ": " + allStudents2.get(i).getName());
                    }

                    System.out.println("Mille opiskelijalle suorite lisätään?");
                    int studentIndex = scanner.nextInt();
                    scanner.nextLine();
                    Student selectedStudent = allStudents2.get(studentIndex);

                    System.out.println("Mille kurssille suorite lisätään?");
                    String course = scanner.nextLine();
                    System.out.println("Mikä arvosana kurssille lisätään?");
                    int grade = scanner.nextInt();
                    scanner.nextLine();

                    selectedStudent.addGrade(course, grade);
                    break;

                case 4:
                    List<Student> allStudents3 = university.getStudents();
                    for (int i = 0; i < allStudents3.size(); i++) {
                        System.out.println(i + ": " + allStudents3.get(i).getName());
                    }

                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    int studentIndex2 = scanner.nextInt();
                    scanner.nextLine();
                    Student selectedStudent2 = allStudents3.get(studentIndex2);

                    List<Grade> studentGrades = selectedStudent2.getGrades();
                    for (Grade gradeObj : studentGrades) {
                        System.out.println(gradeObj);
                    }

                    break;

                case 5:
                    List<Student> allStudents4 = university.getStudents();
                    for (int i = 0; i < allStudents4.size(); i++) {
                        System.out.println(i + ": " + allStudents4.get(i).getName());
                    }

                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    int studentIndex3 = scanner.nextInt();
                    scanner.nextLine();
                    Student selectedStudent3 = allStudents4.get(studentIndex3);

                    double average = Calculator.getAverageGrade(selectedStudent3);
                    System.out.println("Keskiarvo on " + average);

                    break;

                case 6:
                    List<Student> allStudents5 = university.getStudents();
                    for (int i = 0; i < allStudents5.size(); i++) {
                        System.out.println(i + ": " + allStudents5.get(i).getName());
                    }

                    System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    int studentIndex4 = scanner.nextInt();
                    scanner.nextLine();
                    Student selectedStudent4 = allStudents5.get(studentIndex4);

                    double median = Calculator.getMedianGrade(selectedStudent4);
                    System.out.println("Mediaani on " + median);

                    break;

                case 7:
                    university.saveFile();
                    /*System.out.println("Opiskelijat tallennettu tiedostoon.");*/
                    break;

                case 8:
                    university = University.loadFile();
                    break;

            }
        } while (choose != 0);

        scanner.close();
        System.out.println("Kiitos ohjelman käytöstä.");
    }
}