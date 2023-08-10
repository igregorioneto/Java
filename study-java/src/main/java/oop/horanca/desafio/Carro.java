package oop.horanca.desafio;

public class Carro {
    int velocidade = 0;

    boolean acelerar() {
        if(velocidade >= 0) {
            velocidade += 5;
            return true;
        }
        return false;
    }

    boolean frear() {
        if(velocidade > 0) {
            velocidade -= 5;
            if (velocidade < 0) velocidade = 0;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Velocidade do carro é " + velocidade + "KM/H";
    }
}
