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

    public String calculator() {
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
                return "Error performing calculation, check operator or entered values.";
        }
        return "The result is: " + String.valueOf(result);
    }

    @Override
    public String toString() {
        return calculator()  + "\n";
    }
}
