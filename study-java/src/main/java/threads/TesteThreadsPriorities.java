package threads;

public class TesteThreadsPriorities {
    public static void main(String[] args) {
        MinhaThreadsIsAliveJoin thread1 =  new MinhaThreadsIsAliveJoin("#1", 500);
        MinhaThreadsIsAliveJoin thread2 =  new MinhaThreadsIsAliveJoin("#2", 500);
        MinhaThreadsIsAliveJoin thread3 =  new MinhaThreadsIsAliveJoin("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
