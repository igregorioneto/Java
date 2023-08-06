package org.challenges.utils;

public interface Parse<T> {
    T parse(String input) throws NumberFormatException;
}
