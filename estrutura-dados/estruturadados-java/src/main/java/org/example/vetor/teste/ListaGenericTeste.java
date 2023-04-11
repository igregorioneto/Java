package org.example.vetor.teste;

import org.example.vetor.Lista;

public class ListaGenericTeste {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor);
    }
}
