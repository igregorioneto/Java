package org.challenges.simple_calculator;

import org.challenges.utils.InputUtils;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two valid numbers to perform the calculations and operation.");
        double n1 = InputUtils.readValue("Enter the first number: ", Double::parseDouble);
        double n2 = InputUtils.readValue("Enter the two number: ", Double::parseDouble);
        System.out.print("Enter the math operation (+, -, *, /): ");
        String operation = sc.next();

        SimpleCalculator calculator = new SimpleCalculator(n1, n2, operation);

        System.out.print(calculator);
    }
}
