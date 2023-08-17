package streams.filter;

public class Produto {
    final String nome;
    final double price;
    final boolean isEstoque;

    public Produto(String nome, double price, boolean isEstoque) {
        this.nome = nome;
        this.price = price;
        this.isEstoque = isEstoque;
    }
}
