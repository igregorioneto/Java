package threads;

public class TesteMinhaThreadsRunnable {
    public static void main(String[] args) {
        MinhaThreadsRunnable thread1 = new MinhaThreadsRunnable("#1", 500);
        //Thread t1 = new Thread(thread1);
        //t1.start();
        MinhaThreadsRunnable thread2 = new MinhaThreadsRunnable("#2", 650);
        MinhaThreadsRunnable thread3 = new MinhaThreadsRunnable("#3", 950);
    }
}
