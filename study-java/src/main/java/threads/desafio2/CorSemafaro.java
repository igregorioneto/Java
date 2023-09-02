package threads.desafio2;

public enum CorSemafaro {
    VERDE(1000), VERMELHO(2000),AMARELO(500);
    private int tempo;

    CorSemafaro(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }
}
