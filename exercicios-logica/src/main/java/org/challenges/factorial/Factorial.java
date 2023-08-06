package org.challenges.factorial;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public String factorialNumber() {
        int result = 1;
        List<String> list = new ArrayList<>();
        for (int i = number; i <= number; i--) {
            if (i < 1) break;
            list.add(String.valueOf(i) + "!");
            result *= i;
        }
        return String.valueOf(list + " = " + result);
    }

    @Override
    public String toString() {
        return "Factorial is: " + factorialNumber();
    }
}
