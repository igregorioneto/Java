package com.study.cm;

import com.study.cm.modelo.Tabuleiro;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(7,7,7);

        tabuleiro.abrir(3,3);
        tabuleiro.alternarMarcacao(4,4);
        tabuleiro.alternarMarcacao(4,5);

        System.out.println(tabuleiro);
    }
}
