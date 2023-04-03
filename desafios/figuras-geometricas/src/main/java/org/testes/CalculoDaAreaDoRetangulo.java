package org.testes;

import org.figuras.*;

public class CalculoDaAreaDoRetangulo {
    public static void main(String[] args) {
        Retangulo re1 = new Retangulo(5.0,2.0, "Azul");
        System.out.println(re1.toString());

        Figura f1 = new Retangulo(5.0, 25.0, "Verde");
        System.out.println(f1.toString());

        Triangulo t1 = new Triangulo(5, 10, "Vermelho");
        System.out.println(t1.toString());

        Circulo c1 = new Circulo(4, "Laranja");
        System.out.println(c1.toString());

        Quadrado q1 = new Quadrado(4, "Violeta");
        System.out.println(q1.toString());
    }
}
