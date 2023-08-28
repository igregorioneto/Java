package threads;

public class Teste {
    public static void main(String[] args) {
        MinhaThreads threads1 = new MinhaThreads("Thread #1", 900);

        MinhaThreads threads2 = new MinhaThreads("Thread #2", 600);

        MinhaThreads threads3 = new MinhaThreads("Thread #3", 500);
    }
}
