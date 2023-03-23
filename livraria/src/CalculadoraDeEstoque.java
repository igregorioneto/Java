public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;

        for (double i = 0; i < 35; i++) {
            soma += 59.90;
        }

        System.out.println("O total em estoque é: " + soma);

        boolean resultado = soma < 150;
        if (resultado)
            System.out.println("Seu estoque esta muito baixo!");
        else
            System.out.println("Seu estoque esta bom!");
    }
}
