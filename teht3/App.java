package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gifu gifu = new Gifu();

        System.out.println("Tervetuloa Gifu-järjestelmään");
        String university = "";
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        if (scanner.hasNextLine()) {
            university = scanner.nextLine();
        } else {
            System.out.println("Virhe: Yliopiston nimeä ei voitu lukea.");
            scanner.close();
            return;
        }

        int choose;
        do {
            try {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1: //luo uusi kurssi
                System.out.println("Anna kurssin nimi:");
                String courseName = scanner.nextLine();

                System.out.println("Anna kurssin ID:");
                String courseID = scanner.nextLine();

                System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                int maxNumberOfStudents = scanner.nextInt();
                scanner.nextLine();

                Course newCourse = new Course(courseName, courseID, maxNumberOfStudents);
                newCourse.setMaxNumberOfStudents(maxNumberOfStudents);
                    
                gifu.addCourse(newCourse); //lisää kurssi gifu object
                    break;

                case 2: //luo uusi opiskelija
                System.out.println("Anna opiskelijan nimi:");
                String studentName = scanner.nextLine();

                System.out.println("Anna opiskelijan opiskelijanumero:");
                String studentID = scanner.nextLine();

                Student newStudent = new Student(studentName, studentID);

                gifu.addStudent(newStudent);
                    break;

                case 3: //listaa kurssit
                ArrayList<Course> courses = gifu.getCourses();
                for (int i = 0; i < courses.size(); i++) {
                    System.out.println(i + ") " + courses.get(i).getCourseId() + " " + courses.get(i).getCourseName());
                }
                    break;

                case 4: //listaa opiskelijat
                ArrayList<Student> students = gifu.getStudents();
                for (int i = 0; i< students.size(); i++) {
                    System.out.println(i + ") " + students.get(i).getStudentId() + " " + students.get(i).getName());
                }
                    break;

                case 5: //lisää opiskelija kurssille
                System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                ArrayList<Course> coursesList = gifu.getCourses();
                for (int i = 0; i < coursesList.size(); i++) {
                    System.out.println(i + ") " + coursesList.get(i).getCourseId() + " " + coursesList.get(i).getCourseName());
                }
                int courseIndex = scanner.nextInt();
                scanner.nextInt();
                Course selectedCourse = coursesList.get(courseIndex);

                System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numeero:");
                ArrayList<Student> studentsList = gifu.getStudents();
                for (int i = 0; i < studentsList.size(); i++) {
                    System.out.println(i + ") " + studentsList.get(i).getStudentId() + " " + studentsList.get(i).getName());
                }
                int studentIndex = scanner.nextInt();
                scanner.nextLine();
                Student selectedStudent = studentsList.get(studentIndex);

                String courseIdToAddStudent = scanner.nextLine();
                Course courseToAddStudent = gifu.getCourse(courseIdToAddStudent);

                

                    break;

                case 6: //anna kurssiarvosanat

                    break;

                case 7: //listaa kurssilla olevat opiskelijat
                System.out.println("Kurssit:");
                ArrayList<Course> courses2 = gifu.getCourses();
                for (int i = 0; i < courses.size(); i++) {
                    System.out.println(i + ") " + courses.get(i).getCourseId() + " " + courses.get(i).getCourseName());
                }
                System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                int courseIndex2 = scanner.nextInt();
                scanner.nextLine();
                Course selectedCourse2 = courses.get(courseIndex);

               ArrayList<Student> enrolledStudents = selectedCourse.getStudent();
               System.out.println("Kurssilla " + selectedCourse.getCourseName() + " olevat opiskelijat:");
                for (Student student : enrolledStudents) {
                    System.out.println(student.getStudentId() + " " + student.getName() + ", arvosana " + student.getGrade());
                }
                    break;

                case 8: //listaa opiskelijan arvosanat

                    break;

                case 9: //listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat

                    break;

                //case 0: 
                //System.out.println("Kiitos ohjelman käytöstä.");
                //scanner.close();
               // return;
            
                default:
                System.out.println("Virheellinen valinta. Anna uusi valinta.");
                    break;
            }
        } catch (java.util.NoSuchElementException e) {
           // System.out.println("Virhe: Odottamaton syöte. Yritä uudelleen.");
            //scanner.nextInt();

            choose = 0;
        }
        } while (choose != 0);
        System.out.println("Kiitos ohjelman käytöstä.");
        scanner.close();
    }
}