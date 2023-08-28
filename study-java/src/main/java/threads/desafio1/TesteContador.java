package threads.desafio1;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        ThreadContador thread1 = new ThreadContador("#1", contador);
        ThreadContador thread2 = new ThreadContador("#2", contador);
        ThreadContador thread3 = new ThreadContador("#3", contador);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Valor final do Contador é: " + contador.getValor());
    }
}
