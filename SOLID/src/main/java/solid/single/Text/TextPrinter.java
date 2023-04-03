package solid.single.Text;

import java.util.Arrays;

public class TextPrinter {
    TextManipulatior textManipulatior;

    public TextPrinter(TextManipulatior textManipulatior) {
        this.textManipulatior = textManipulatior;
    }

    public void printText() {
        System.out.println(textManipulatior.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulatior.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulatior.getText().substring(startingIndex, endIndex));
    }
}
