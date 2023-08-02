package org.challenges.factorial;

import org.challenges.utils.InputUtils;

public class FactorialTest {
    public static void main(String[] args) {
        int number = InputUtils.readValue("Type a number to get your factorial: ", Integer::parseInt);
        Factorial f = new Factorial(number);
        System.out.println(f);
    }
}
