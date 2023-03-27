package br.com.estudo.livraria.produtos;

public interface Produto extends Comparable<Produto> {
    double getValor();

    int compareTo(Produto outro);
}
