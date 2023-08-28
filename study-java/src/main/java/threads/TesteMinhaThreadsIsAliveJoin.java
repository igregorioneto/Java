package threads;

public class TesteMinhaThreadsIsAliveJoin {
    public static void main(String[] args) {
        MinhaThreadsIsAliveJoin thread1 = new MinhaThreadsIsAliveJoin("#1", 500);
        MinhaThreadsIsAliveJoin thread2 = new MinhaThreadsIsAliveJoin("#2", 650);
        MinhaThreadsIsAliveJoin thread3 = new MinhaThreadsIsAliveJoin("#3", 950);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado");
    }
}
