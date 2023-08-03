package arrays;

import java.util.Scanner;

public class NotasDeMaisDeUmAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos tem na turma? ");
        int quantidadeAlunos = sc.nextInt();

        System.out.print("Quantas notas terá o aluno: ");
        int quantidadeNotasAluno = sc.nextInt();

        double[][] alunos = new double[quantidadeAlunos][quantidadeNotasAluno];
        double total = 0;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < quantidadeNotasAluno; j++) {
                System.out.print("Digite a " + (j + 1) + "° nota do aluno " + (i + 1) + ": ");
                alunos[i][j] = sc.nextDouble();
                total += alunos[i][j];
            }
        }
        System.out.println("A media total da turma é: " + (total / (quantidadeAlunos * quantidadeNotasAluno)));
    }
}
