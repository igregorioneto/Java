package threads;

public class TesteMinhaThreadsIsAliveJoin2 {
    public static void main(String[] args) {
        MinhaThreadsIsAliveJoin thread1 = new MinhaThreadsIsAliveJoin("#1", 950);
        MinhaThreadsIsAliveJoin thread2 = new MinhaThreadsIsAliveJoin("#2", 650);
        MinhaThreadsIsAliveJoin thread3 = new MinhaThreadsIsAliveJoin("#3", 500);

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
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
