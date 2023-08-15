package lambda.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome);
        Produto p = new Produto("Caneta", 10, 0.05);
        imprimirNome.accept(p);

        Produto p1 = new Produto("Notebook", 3000, 0.05);
        Produto p2 = new Produto("Fogão", 1000, 0.05);
        Produto p3 = new Produto("Geladeira", 4000, 0.05);
        Produto p4 = new Produto("Caderno", 15, 0.05);
        Produto p5 = new Produto("Cadeira", 750, 0.05);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
