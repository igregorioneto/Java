package org.challenges.vowel_counter;

import org.challenges.utils.InputUtils;

public class VowelCounterTest {
    public static void main(String[] args) {
        String word = InputUtils.readValue("Type a word to check the amount of vowels: ", String::toString);
        VowelCounter vowel = new VowelCounter(word);
        System.out.println(vowel);
    }
}
