package oop.horanca;

public class JogoTesteCombate {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(10,10);
        System.out.println("Instancias iniciais do heroi: " + heroi.x + " " + heroi.y);

        Monstro monstro = new Monstro();
        System.out.println("Instancias iniciais do monstro: " + monstro.x + " " + monstro.y);
        monstro.x = 10;
        monstro.y = 11;

        System.out.println("Vida do Haroi: " + heroi.vida);
        System.out.println("Vida do Monstro: " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Vida do Haroi: " + heroi.vida);
        System.out.println("Vida do Monstro: " + monstro.vida);
    }
}
