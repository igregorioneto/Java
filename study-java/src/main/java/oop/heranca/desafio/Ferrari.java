package oop.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean turboLigado;
    private boolean arLigado;

    Ferrari() {
        super(315);
    }

    public Ferrari(int velocidadeMaxima) {
        this(velocidadeMaxima, 15);
    }

    Ferrari(int velocidadeMaxima, int delta) {
        super(velocidadeMaxima, delta);
    }

    public void frear(int f) {
        if(velocidade > 0) {
            velocidade -= f;
            if (velocidade < 0) velocidade = 0;
        }
    }

    @Override
    public void ligarTurbo() {
        turboLigado = true;
    }

    @Override
    public void desligarTurbo() {
        turboLigado = false;
    }

    @Override
    public void ligarAr() {
        arLigado = true;
    }

    @Override
    public void desligarAr() {
        arLigado = false;
    }

    @Override
    public int getDelta() {
        if(turboLigado && !arLigado) {
            return 35;
        } else if (turboLigado && arLigado) {
            return 30;
        } else if (!turboLigado && !arLigado) {
            return 20;
        } else {
            return 15;
        }
    }
}
