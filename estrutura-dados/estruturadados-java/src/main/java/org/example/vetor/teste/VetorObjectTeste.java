package org.example.vetor.teste;

import org.example.vetor.Contato;
import org.example.vetor.VetorObject;

public class VetorObjectTeste {
    public static void main(String[] args) {
        Contato c1 = new Contato("Contato 1", "1234-56789", "contato1@teste.com");
        Contato c2 = new Contato("Contato 2", "56789-1234", "contato2@teste.com");
        Contato c3 = new Contato("Contato 3", "98765-4321", "contato3@teste.com");

        VetorObject vetor = new VetorObject(3);
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        int pos = vetor.busca(c1);
        if (pos > -1) {
            System.out.println("Valor do objeto c1 existe no vetor");
        } else {
            System.out.println("Valor do objeto c1 não existe no vetor");
        }

        System.out.println(vetor);
    }
}
