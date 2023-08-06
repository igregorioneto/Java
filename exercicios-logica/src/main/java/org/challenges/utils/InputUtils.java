package org.challenges.utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static <T> T readValue(String message, Parse<T> parser) {
        T value;
        while (true) {
            System.out.print(message);
            String entry = sc.next();
            try {
                value = parser.parse(entry);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, try again!");
            }
        }
        return value;
    }
}
