package oop.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari() {
        super(315);
    }

    Ferrari(int velocidadeMaxima) {
        this(velocidadeMaxima, 15);
    }

    Ferrari(int velocidadeMaxima, int delta) {
        super(velocidadeMaxima, delta);
    }

    void frear(int f) {
        if(velocidade > 0) {
            velocidade -= f;
            if (velocidade < 0) velocidade = 0;
        }
    }
}
