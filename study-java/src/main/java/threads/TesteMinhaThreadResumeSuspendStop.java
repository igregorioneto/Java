package threads;

public class TesteMinhaThreadResumeSuspendStop {
    public static void main(String[] args) {
        MinhaThreadResumeSuspendStop t1 = new MinhaThreadResumeSuspendStop("#1");
        MinhaThreadResumeSuspendStop t2 = new MinhaThreadResumeSuspendStop("#2");

        System.out.println("Thread #1 suspend");
        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread #2 suspend");
        t2.suspend();

        System.out.println("Thread #1 resume");
        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread #2 resume");
        t2.resume();
        System.out.println("Thread #2 stop");
        t2.stop();
    }
}
