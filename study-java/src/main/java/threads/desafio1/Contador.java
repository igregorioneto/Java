package threads.desafio1;

public class Contador {
    private int valor = 0;

    public Contador() {}

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }
}
