package threads.desafio2;

public class ThreadSemafaro implements Runnable{

    private CorSemafaro cor;
    private boolean parar;
    private boolean mudarCor;

    ThreadSemafaro() {
        this.cor = CorSemafaro.VERMELHO;

        this.parar = false;
        this.mudarCor = false;

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
                Thread.sleep(cor.getTempo());
                mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor() {
        switch (cor) {
            case VERMELHO:
                cor = CorSemafaro.VERDE;
                break;
            case VERDE:
                cor = CorSemafaro.AMARELO;
                break;
            case AMARELO:
                cor = CorSemafaro.VERDE;
                break;
            default: break;
        }
        mudarCor = true;
        notify();
    }

    public synchronized void esperarMudarCor() {
        while (!mudarCor) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        mudarCor = false;
    }

    public synchronized void desligarSemafaro() {
        parar = true;
    }

    public CorSemafaro getCor() {
        return cor;
    }
}
