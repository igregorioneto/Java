package br.com.estudo.livraria.produtos;

import br.com.estudo.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() { return total; }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
