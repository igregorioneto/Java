package org.example.vetor.teste;

import org.example.vetor.Vetor;

public class VetorTeste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
