package org.challenges.table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int number;

    public Table(int number) {
        this.number = number;
    }

    private String tablePeriodic() {
        String table = "";
        List<String> operators = List.of("+", "-", "*", "/");
        for (String o: operators) {
            for (int i = 1; i <= 10 ; i++) {
                table += number + " " + o + " " + i + " = " + calculator(o, number, i) + " |\n";
            }
            table += "\n";
        }
        return table;
    }

    private int calculator(String operator, int number, int interator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = number + interator;
                break;
            case "-":
                result = number - interator;
                break;
            case "*":
                result = number * interator;
                break;
            case "/":
                result = number / interator;
                break;
            default:
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return tablePeriodic();
    }
}
