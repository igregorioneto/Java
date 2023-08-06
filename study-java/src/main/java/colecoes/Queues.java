package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> filas = new LinkedList<>();

        filas.add("Ana");
        filas.offer("Bia");
        filas.add("Carlos");
        filas.offer("Daniel");
        filas.add("Gui");

        for (String f:filas) {
            System.out.println(f);
        }

        System.out.println("-----------");
        System.out.println(filas.peek());
        System.out.println(filas.element());

        System.out.println("-----------");
        System.out.println(filas.poll());
        System.out.println(filas.peek());
    }
}
