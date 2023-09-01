package threads;

public class Calculadora {
    private int soma;

    public synchronized int somaArray(int[] nums) {
        soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName() + ", soma: " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return soma;
    }
}
