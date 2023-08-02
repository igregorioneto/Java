package org.challenges.palindrome;

public class Palindrome {
    private String word;

    public Palindrome(String word) {
        this.word = word;
    }

    private boolean isPalindrome() {
        if (word.trim().equals(invertString())) return true;
        return false;
    }

    private String invertString() {
        return new StringBuilder(word.trim()
        ).reverse().toString();
    }

    @Override
    public String toString() {
        return "Is Palindrome: " + isPalindrome() + "\n";
    }
}
