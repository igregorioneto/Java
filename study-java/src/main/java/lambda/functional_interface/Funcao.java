package lambda.functional_interface;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                valor -> valor % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(14));

        Function<String, String> resultado =
                valor -> "O resultado é " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        String r = parOuImpar
                .andThen(resultado)
                .andThen(empolgado)
                .apply(14);
        System.out.println(r);
    }
}