package org.challenges.vowel_counter;

import java.util.List;

public class VowelCounter {
    private String word;

    public VowelCounter(String word) {
        this.word = word;
    }

    private int vowelCounter() {
        String[] arr = word.trim().split("");
        int count = 0;
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        for (String c: arr) {
            for (String v:vowels) {
                if(v.equals(c)) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return "Number of vowels is: " + vowelCounter();
    }
}
