package com.study.cm.visao;

import com.study.cm.excecao.ExplosaoException;
import com.study.cm.excecao.SairException;
import com.study.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner sc = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;
            while (continuar) {
                cicloJogo();
                System.out.println("Outra partida? (S/n) ");
                String resposta = sc.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Saiu do jogo!");
        } finally {
            sc.close();
        }
    }

    private void cicloJogo() {
        try {

            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturaValorDigitado("Digite a posição (x, y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim())).iterator();

                digitado = capturaValorDigitado("1 - Abrir ou 2 - Marcar/Desmarcar: ");

                if ("1".equalsIgnoreCase(digitado)) {
                    tabuleiro.abrir(xy.next(), xy.next());
                } else if ("2".equalsIgnoreCase(digitado)) {
                    tabuleiro.alternarMarcacao(xy.next(), xy.next());
                }
            }

            System.out.println(tabuleiro);
            System.out.println("Você ganhou!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você perdeu!");
        }
    }

    private String capturaValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = sc.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }

        return digitado;
    }
}
