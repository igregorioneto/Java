package lambda.functional_interface;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);
        Function<Double, Double> impostoMunicipal = imp -> imp >= 2500 ? imp * 1.085 : imp;
        Function<Double, Double> frete = f -> f >= 3000 ? f + 100 : f + 50;
        Function<Double, Double> arredondandoOPreco = arr -> Double.parseDouble(String.format("%.2f", arr));
        Function<Double, String> formatando = arr -> ("R$" + arr).replace(".", ",");
        System.out.println(precoReal.apply(p));
        System.out.println(precoReal.andThen(impostoMunicipal).apply(p));
        System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).apply(p));
        System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arredondandoOPreco).apply(p));
        System.out.println(
                precoReal
                        .andThen(impostoMunicipal)
                        .andThen(frete)
                        .andThen(arredondandoOPreco)
                        .andThen(formatando)
                        .apply(p)
        );
    }
}
