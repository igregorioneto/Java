package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static void main(String[] args) {
        Deque<String> pilhas = new ArrayDeque<>();

        pilhas.add("Java OOP");
        pilhas.push("Design Patters");
        pilhas.push("AWS");

        for (String p: pilhas) {
            System.out.println(p);
        }

        System.out.println("------------");
        System.out.println(pilhas.peek());
        System.out.println(pilhas.element());

        System.out.println("------------");
        System.out.println(pilhas.poll());
        System.out.println(pilhas.element());



    }
}
