package oop.heranca.desafio_polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(95.6);
        Alimento a1 = new Feijao(0.1);
        Alimento a2 = new Arroz(0.1);

        p1.comer(a1);
        p1.comer(a2);
        System.out.println(p1);

        Alimento a3 = new Sorvete(0.3);
        p1.comer(a3);
        System.out.println(p1);
    }
}
