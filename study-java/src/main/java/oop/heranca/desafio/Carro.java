package oop.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidade;
    protected int delta;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
        setDelta(5);
    }

    protected Carro(int velocidade, int delta) {
        VELOCIDADE_MAXIMA = velocidade;
        setDelta(delta);
    }

    public void acelerar() {
        if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += getDelta();
        }
    }

    public void frear() {
        if(velocidade > 0) {
            velocidade -= getDelta();
            if (velocidade < 0) velocidade = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "Velocidade do carro é " + velocidade + "KM/H";
    }
}
