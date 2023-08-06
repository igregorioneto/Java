package org.challenges.grade_average;

import java.util.List;

public class CalculatingAvarage {
    public static double avarage(List<GradeAvarage> grades) {
        double sum = 0;
        for (GradeAvarage g: grades) {
            sum += g.getGrade();
        }
        return sum / grades.size();
    }
}
