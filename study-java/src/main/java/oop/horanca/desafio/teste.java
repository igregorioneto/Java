package oop.horanca.desafio;

public class teste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(300);
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear(35);
        System.out.println("Ferrari: " + ferrari);

        BMW bmw = new BMW();
        bmw.acelerar();
        bmw.acelerar();
        System.out.println("BMW: " + bmw);

        Civic civic = new Civic(200);
        civic.acelerar();
        System.out.println("Civic: " + civic);
    }
}
