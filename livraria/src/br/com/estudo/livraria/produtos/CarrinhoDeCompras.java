package br.com.estudo.livraria.produtos;

import br.com.estudo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        this.contador++;
        total += produto.getValor();
    }

    public double getTotal() { return this.total; }

    public Produto[] getProdutos() {
        return produtos;
    }
}
