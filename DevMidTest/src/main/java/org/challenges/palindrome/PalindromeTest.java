package org.challenges.palindrome;

import org.challenges.utils.InputUtils;

public class PalindromeTest {
    public static void main(String[] args) {
        String word = InputUtils.readValue("Type a word to check if  it's a palindrome: ", String::toString);
        Palindrome palindrome = new Palindrome(word);
        System.out.println(palindrome);
    }
}
