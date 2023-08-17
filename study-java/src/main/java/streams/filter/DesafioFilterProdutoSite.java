package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterProdutoSite {
    public static void main(String[] args) {
        ProdutoSite p1 = new ProdutoSite("Notebook", 3000, 0.15, true);
        ProdutoSite p2 = new ProdutoSite("Geladeira", 4000, 0.35, true);
        ProdutoSite p3 = new ProdutoSite("Fogão", 1250, 0.35, false);
        ProdutoSite p4 = new ProdutoSite("Cadeira Gamer", 750, 0.20, false);
        ProdutoSite p5 = new ProdutoSite("Mouse", 70, 0.10, false);

        List<ProdutoSite> produtoSites = Arrays.asList(p1,p2,p3,p4,p5);

        Predicate<ProdutoSite> produtosComSuperDesconto = p -> p.desconto >= 0.30;
        Predicate<ProdutoSite> produtosComFreteGratis = p -> p.frete;
        Function<ProdutoSite, String> mensagem = p -> "O produto " + p.nome + " esta com o super desconto!";

        produtoSites.stream()
                .filter(produtosComSuperDesconto)
                .filter(produtosComFreteGratis)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
