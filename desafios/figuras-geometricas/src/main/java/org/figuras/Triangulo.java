package org.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(String cor) {super.setCor(cor);}

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        super.setCor(cor);
    }

    private double area() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Área do triângulo: " + this.area() + " com cor " + getCor();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
