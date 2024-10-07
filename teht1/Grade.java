//arvosana +kurssin nimi 

package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grade implements Serializable {

    private String course;
    private int grade;

        public Grade(String course, int grade) {
            this.course = course;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }
@Override
        public String toString() {
            return course + ": " + grade;
        }



}
