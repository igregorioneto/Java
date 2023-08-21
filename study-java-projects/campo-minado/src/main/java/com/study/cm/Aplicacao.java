package com.study.cm;

import com.study.cm.modelo.Tabuleiro;
import com.study.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(7,7,7);
        new TabuleiroConsole(tabuleiro);
    }
}
