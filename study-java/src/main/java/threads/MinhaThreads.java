package threads;

public class MinhaThreads extends Thread {
    private String nome;
    private int tempo;

    public MinhaThreads(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
            System.out.println("Fim da Thread " + nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
