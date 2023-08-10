package oop.horanca.desafio;

public class teste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.acelerar(15);
        ferrari.acelerar();
        ferrari.frear(35);
        System.out.println("Ferrari: " + ferrari);

        BMW bmw = new BMW();
        bmw.acelerar();
        System.out.println("BMW: " + bmw);

        Civic civic = new Civic();
        civic.acelerar();
        System.out.println("Civic: " + civic);
    }
}
