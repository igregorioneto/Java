package org.challenges.table;

import org.challenges.utils.InputUtils;

public class TableTest {
    public static void main(String[] args) {
        int number = InputUtils.readValue("Enter a number for the table: ", Integer::parseInt);
        Table table = new Table(number);
        System.out.println(table);
    }
}
