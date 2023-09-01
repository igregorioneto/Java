package threads;

public class MinhaThreadSynchronized implements Runnable {
    private String name;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSynchronized(String name, int[] nums) {
        this.name = name;
        this.nums = nums;
        new Thread(this, name).start();
    }


    @Override
    public void run() {
        System.out.println(name + " iniciada");
        int soma = calc.somaArray(nums);
        System.out.println("Resultado da soma para a thread " + name + " é: " + soma);
        System.out.println(name  + " finalizada");

    }
}
