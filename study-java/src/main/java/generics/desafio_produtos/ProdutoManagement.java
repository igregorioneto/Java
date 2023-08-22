package generics.desafio_produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoManagement<T extends Produto<?>> {
    private List<T> managements = new ArrayList<>();

    public void adicionar(T produto) {
        managements.add(produto);
    }

    public List<T> getAll() {
        return managements.stream().toList();
    }

    public Optional<T> findByNome(String nome) {
        return managements.stream().filter(p -> nome.equalsIgnoreCase(p.getNome())).findFirst();
    }
}
