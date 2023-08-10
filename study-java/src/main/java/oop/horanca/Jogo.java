package oop.horanca;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi();
        j1.x = 10;
        j1.y = 10;

        Monstro j2 = new Monstro();
        j2.x = 10;
        j2.y = 10;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);

        System.out.println(j1.x);
        System.out.println(j1.y);
    }
}
