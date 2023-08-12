package oop.heranca.desafio_polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Alimento alimento) {
        if (alimento.getPeso() > 0) {
            this.peso += alimento.getPeso();
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "O peso da pessoa é " + getPeso();
    }
}
