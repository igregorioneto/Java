package org.challenges.simple_calculator;

import org.challenges.utils.InputUtils;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {
        System.out.println("Enter two valid numbers to perform the calculations and operation.");
        double n1 = InputUtils.readValue("Enter the first number: ", Double::parseDouble);
        double n2 = InputUtils.readValue("Enter the two number: ", Double::parseDouble);
        String operation = InputUtils.readValue("Enter the math operation (+, -, *, /): ", String::toString);

        SimpleCalculator calculator = new SimpleCalculator(n1, n2, operation);

        System.out.print(calculator);
    }
}
