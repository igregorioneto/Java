package org.challenges.prime_numbers;

import org.challenges.utils.InputUtils;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        boolean check = InputUtils.readValue("Want to check first 10 prime numbers or check if the numbers is prime? (true - number specific / false - List prime numbers) ", Boolean::parseBoolean);
        PrimeNumbers prime = new PrimeNumbers();

        if (check) {
            int number = InputUtils.readValue("Enter the number: ", Integer::parseInt);
            prime.setNumber(number);
            System.out.print(prime);
        } else {
            System.out.print("List first 10 prime numbers : " + prime.listNumbersPrime() + "\n");
        }

    }
}
