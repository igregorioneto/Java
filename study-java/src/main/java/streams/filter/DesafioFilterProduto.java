package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Feijão", 6.50, true);
        Produto p2 = new Produto("Arroz", 5.50, true);
        Produto p3 = new Produto("Macarrão", 3, false);
        Produto p4 = new Produto("Sabonete", 1, false);
        Produto p5 = new Produto("Sabão", 3.50, false);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> filtroProdutos = p -> p.price > 3.0;
        Predicate<Produto> filtroIsEstoque = p -> p.isEstoque;
        Function<Produto, String> mensagem =
                p -> "O produto " + p.nome + " tem em estoque e o preço é R$" + p.price;

        produtos.stream()
                .filter(filtroProdutos)
                .filter(filtroIsEstoque)
                .map(mensagem)
                .forEach(System.out::println);

    }
}
