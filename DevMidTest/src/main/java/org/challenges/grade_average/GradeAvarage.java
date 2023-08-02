package org.challenges.grade_average;

public class GradeAvarage {
    private String subject;
    private double grade;

    public GradeAvarage(String subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }
}
