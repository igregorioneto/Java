package org.challenges.interest_calculation;

public class InterestCalculation {
    private double initialCapital;
    private double interestRate;
    private int investimentTime;

    public InterestCalculation(double initialCapital, double interestRate, int investimentTime) {
        this.initialCapital = initialCapital;
        this.interestRate = interestRate;
        this.investimentTime = investimentTime;
    }

    private double interestCalculation() {
        return (initialCapital * interestRate * investimentTime) / 100;
    }

    private double totalAmount() {
        return initialCapital + interestCalculation();
    }

    @Override
    public String toString() {
        return "Interest calculation: $" + interestCalculation() + "\nTotal amount: $" + totalAmount();
    }
}
