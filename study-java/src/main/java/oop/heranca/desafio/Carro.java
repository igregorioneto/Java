package oop.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidade;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    protected Carro(int velocidade, int delta) {
        VELOCIDADE_MAXIMA = velocidade;
        this.delta = delta;
    }

    public void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += delta;
        }
    }

    public void frear() {
        if(velocidade > 0) {
            velocidade -= delta;
            if (velocidade < 0) velocidade = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade do carro é " + velocidade + "KM/H";
    }
}
