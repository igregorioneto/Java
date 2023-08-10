package oop.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidade;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    Carro(int velocidade, int delta) {
        VELOCIDADE_MAXIMA = velocidade;
        this.delta = delta;
    }

    void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += delta;
        }
    }

    void frear() {
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
