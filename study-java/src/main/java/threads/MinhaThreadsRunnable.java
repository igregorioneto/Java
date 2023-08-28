package threads;

public class MinhaThreadsRunnable implements Runnable {
    private String nome;
    private int tempo;

    public MinhaThreadsRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
            System.out.println("Fim da thread " + nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
