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

        System.out.println("===================");
        Function<Produto, String> prod = p -> p.nome;
        Function<Produto, String> prodPreco = p -> " R$" + p.preco;
        Function<Produto, String> prodPrecoComDesconto =
                p -> " O preço com desconto é: " + (p.preco * (1 - p.desconto));

        Produto produto = new Produto("Notebook", 4000, 0.15);

        String resultadoProduto = prod
                .apply(produto);
        System.out.println(resultadoProduto);
    }
}
