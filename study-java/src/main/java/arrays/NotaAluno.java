package arrays;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas que será inserida: ");
        int quantidadeNotas = sc.nextInt();

        double[] notas = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota: ");
            double nota = sc.nextDouble();
            notas[i] = nota;
        }

        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }

        System.out.println("Média das notas: " + (soma / notas.length));
    }
}
