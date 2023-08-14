package lambda.first_function;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Bia", "Ana", "Gil", "Gui");
        System.out.println("Forma tradicional");
        for (String a: aprovados) {
            System.out.println(a);
        }

        System.out.println("\nLambda 01");
        aprovados.forEach((nome) -> System.out.println(nome));

        System.out.println("\nLambda 02");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda 03");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nLambda 04");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Olá, meu nome é " + nome);
    }
}
