package streams.filter;

public class ProdutoSite {
    final String nome;
    final double preco;
    final double desconto;
    final boolean frete;

    public ProdutoSite(String nome, double preco, double desconto, boolean frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }
}
