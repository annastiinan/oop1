package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public static double getAverageGrade(Student student) {
        List<Grade> grades = student.getGrades();
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getGrade();
        }
        return (double) sum / grades.size();
    }

    public static double getMedianGrade(Student student) {
        List<Grade> grades = student.getGrades();
        if (grades.isEmpty()) {
            return 0.0;
        }

        List<Integer> gradeValues = new ArrayList<>();
        for (Grade grade : grades) {
            gradeValues.add(grade.getGrade());
        }
        Collections.sort(gradeValues);

        int size = gradeValues.size();
        if (size % 2 == 0) {
            int mid1 = gradeValues.get(size / 2 - 1);
            int mid2 = gradeValues.get(size / 2);
            return (double) (mid1 + mid2) / 2.0;
        } else {
            return (double) gradeValues.get(size / 2);
        }
    }
}
