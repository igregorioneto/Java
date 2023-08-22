package generics.desafio_produtos;

public class ProdutoTeste {
    public static void main(String[] args) {
        ProdutoManagement<Produto<?>> produtos = new ProdutoManagement<>();

        Produto<Brinquedo> carrinho = new Produto<>("Carrinho", 50.0);
        Produto<Informatica> notebook = new Produto<>("Notebook", 4000.0);

        produtos.adicionar(carrinho);
        produtos.adicionar(notebook);

        System.out.println(produtos.getAll());

        System.out.println(produtos.findByNome("Notebook"));

        ProdutoManagement<Produto<Informatica>> informatica = new ProdutoManagement<>();
        Produto<Informatica> teclado = new Produto<>("Teclado", 100.0);
        informatica.adicionar(notebook);
        informatica.adicionar(teclado);
        System.out.println(informatica.getAll());

    }
}
