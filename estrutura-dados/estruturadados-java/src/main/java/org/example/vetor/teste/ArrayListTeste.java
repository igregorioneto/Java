package org.example.vetor.teste;

import java.util.ArrayList;

public class ArrayListTeste {
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<>();
        vetor.add("A");
        vetor.add("C");

        System.out.println(vetor);

        vetor.add(1, "B");

        System.out.println(vetor);

        boolean exists = vetor.contains("B");
        if (exists) {
            System.out.println("Valor existe");
        } else {
            System.out.println("Valor não existe");
        }

        int pos = vetor.indexOf("B");
        if (pos > -1) {
            System.out.println("Valor existe " + pos);
        } else {
            System.out.println("Valor não existe " + pos);
        }

        System.out.println(vetor.get(pos));
        vetor.remove(0);
        vetor.remove("B");
        System.out.println(vetor);

        System.out.println(vetor.size());
    }
}
