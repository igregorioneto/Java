package threads;

public class MinhaThreadResumeSuspendStop implements Runnable{

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    MinhaThreadResumeSuspendStop(String nome) {
        this.nome = nome;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + nome);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (foiTerminada) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + nome + " terminada.");
    }

    void suspend() {
        estaSuspensa = true;
    }

    synchronized void resume() {
        estaSuspensa = false;
        notify();
    }

    synchronized void stop() {
        foiTerminada = true;
    }
}
