package org.figuras;

public class Circulo extends Figura{
    private double raio;

    public Circulo(String cor) {super.setCor(cor);}

    public Circulo(double raio, String cor) {
        this.raio = raio;
        super.setCor(cor);
    }

    public double area() {
        return Math.PI * Math.sqrt(this.raio) ;
    }

    public double diametro() {
        return this.raio * 2;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return "Área do Círculo: " + this.area() +
                " com diâmetro: " + this.diametro() +
                " com a cor " + this.getCor();
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
