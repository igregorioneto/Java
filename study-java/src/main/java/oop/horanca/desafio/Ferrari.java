package oop.horanca.desafio;

public class Ferrari extends Carro {
    boolean acelerar() {
        boolean acelerar1 = super.acelerar();
        boolean acelerar2 = super.acelerar();
        boolean acelerar3 = super.acelerar();
        return acelerar1 && acelerar2 && acelerar3;
    }

    boolean acelerar(int a) {
        if(velocidade >= 0) {
            velocidade += a;
            return true;
        }
        return false;
    }

    boolean frear(int f) {
        if(velocidade > 0) {
            velocidade -= f;
            if (velocidade < 0) velocidade = 0;
            return true;
        }
        return false;
    }
}
