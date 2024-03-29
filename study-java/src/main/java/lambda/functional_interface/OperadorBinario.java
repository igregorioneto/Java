package lambda.functional_interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.7, 5.1));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            boolean r = ((n1 + n2) / 2 ) >= 7;
            return r ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(9.7, 5.1));

        Function<Double, String> mediaAlunos =
                m -> m >= 7 ? "Aprovado" : "Reprovado";

        String resultadoFinal = media
                .andThen(mediaAlunos)
                .apply(9.7,5.1);
        System.out.println(resultadoFinal);

    }
}
