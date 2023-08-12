package oop.abstrato;

public class Teste {
    public static void main(String[] args) {
        Mamiferos a = new Cachorro();
        System.out.println(a.alimentacao());
        System.out.println(a.andar());
        System.out.println(a.respirar());
    }
}
