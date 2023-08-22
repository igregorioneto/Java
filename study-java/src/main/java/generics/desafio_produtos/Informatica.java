package generics.desafio_produtos;

public class Informatica extends Produto<Informatica> {
    public Informatica(String nome, Double preco) {
        super(nome, preco);
    }

}
