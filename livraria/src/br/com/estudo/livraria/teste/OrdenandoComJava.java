package br.com.estudo.livraria.teste;

import br.com.estudo.livraria.Autor;
import br.com.estudo.livraria.produtos.Ebook;
import br.com.estudo.livraria.produtos.LivroFisico;
import br.com.estudo.livraria.produtos.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoComJava {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("José da Silva");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java na prática");
        livroFisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java na prática");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(livroFisico, ebook);

        Collections.sort(produtos);

        for (Produto produto: produtos) {
            System.out.println(produto.getValor());
        }
    }
}
