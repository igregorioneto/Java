package org.challenges.interest_calculation;

import org.challenges.utils.InputUtils;

public class InterestCalculationTest {
    public static void main(String[] args) {
        double initialCapital = InputUtils.readValue("Enter the starting capital: $", Double::parseDouble);
        double interestRate = InputUtils.readValue("Enter the interest rate: %", Double::parseDouble);
        int investimentTime = InputUtils.readValue("Enter the investiment time (in months): Months ", Integer::parseInt);

        InterestCalculation interest = new InterestCalculation(initialCapital, interestRate, investimentTime);
        System.out.println(interest);
    }
}
