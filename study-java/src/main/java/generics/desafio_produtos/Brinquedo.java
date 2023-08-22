package generics.desafio_produtos;

public class Brinquedo extends Produto<Brinquedo> {
    public Brinquedo(String nome, Double preco) {
        super(nome, preco);
    }
}
