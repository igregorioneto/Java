package threads;

public class TesteMinhaThreadSynchronized {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        MinhaThreadSynchronized t1 = new MinhaThreadSynchronized("#1", nums);
        MinhaThreadSynchronized t2 = new MinhaThreadSynchronized("#2", nums);
    }
}
