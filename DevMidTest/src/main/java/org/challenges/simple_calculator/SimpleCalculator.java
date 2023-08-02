package org.challenges.simple_calculator;

public class SimpleCalculator {
    private double number1;
    private double number2;
    private String operator;

    public SimpleCalculator(double number1, double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public double calculator() {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        if (calculator() == 0) {
            return "Error performing calculation, check operator or entered values.";
        } else {
            return "The result is: " + calculator();
        }
    }
}
