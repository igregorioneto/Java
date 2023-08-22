package generics.desafio_produtos;

public class Produto<T> {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreco: " + preco + "\n";
    }
}
