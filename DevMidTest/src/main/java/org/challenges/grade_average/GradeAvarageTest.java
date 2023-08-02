package org.challenges.grade_average;

import org.challenges.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

public class GradeAvarageTest {
    public static void main(String[] args) {
        System.out.println("Grade Avarage...");
        int quantity = InputUtils.readValue("Enter the number of subjects: ", Integer::parseInt);
        List<GradeAvarage> grades = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            String subject = InputUtils.readValue("Enter the name of "  + i + "° subject: ", String::toString);
            double grade = InputUtils.readValue("Enter the grade of the " + subject + " subject: ", Double::parseDouble);

            grades.add(new GradeAvarage(subject, grade));
        }

        double avarage = CalculatingAvarage.avarage(grades);
        System.out.printf("The avarage of the subjects is: %.2f\n",avarage);
    }
}
