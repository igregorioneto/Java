package org.challenges.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private int number;

    public PrimeNumbers(){}

    public PrimeNumbers(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean numberPrime() {
        boolean isPrimo = false;
        if (number <= 1) {
            return isPrimo;
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if(count == 2) isPrimo = true;

        return isPrimo;
    }

    public boolean numberPrime(int number) {
        boolean isPrimo = false;
        if (number <= 1) {
            return isPrimo;
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if(count == 2) isPrimo = true;

        return isPrimo;
    }

    public String listNumbersPrime() {
        int count = 1;
        List<Integer> numbers = new ArrayList<>();
        while(true) {
            if (numberPrime(count)) {
                numbers.add(count);
            }
            count++;

            if (numbers.size() >= 10) break;
        }

        return String.valueOf(numbers);
    }

    @Override
    public String toString() {
        return "Is value prime: " + numberPrime() + "\n";
    }
}
