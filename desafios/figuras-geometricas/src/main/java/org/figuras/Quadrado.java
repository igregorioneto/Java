package org.figuras;

public class Quadrado extends Retangulo {
    public Quadrado(double lado1, String cor) {
        super(lado1, cor);
    }

    @Override
    public double area() {
        return getLado1() * getLado1();
    }

    @Override
    public String toString() {
        return "Área do quadrado é: " + this.area() + " com cor " + getCor();
    }
}
