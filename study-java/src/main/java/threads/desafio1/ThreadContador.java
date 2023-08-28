package threads.desafio1;

import java.util.Random;

public class ThreadContador implements Runnable {
    private String nome;
    private Contador contador;

    public ThreadContador(String nome, Contador contador) {
        this.nome = nome;
        this.contador = contador;
    }

    @Override
    public void run() {
        Random random = new Random();
        int quantidadeAleatoria = random.nextInt(11);
        System.out.println(nome + " e sua Quantidade aleatória: " + quantidadeAleatoria);
        for (int i = 0; i < quantidadeAleatoria; i++) {
            contador.incrementar();
        }
    }
}
