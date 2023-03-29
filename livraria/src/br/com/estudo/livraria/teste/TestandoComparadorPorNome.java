package br.com.estudo.livraria.teste;

import br.com.estudo.livraria.Autor;
import br.com.estudo.livraria.produtos.ComparadorPorNome;
import br.com.estudo.livraria.produtos.Livro;
import br.com.estudo.livraria.produtos.LivroFisico;

import java.util.*;
import java.util.stream.Stream;

public class TestandoComparadorPorNome {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("José da Silva");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
//        Collections.sort(livros, new ComparadorPorNome());
//        livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));
//        livros.sort(Comparator.comparing(l -> l.getNome()));
        livros.sort(Comparator.comparing(Livro::getNome));

        System.out.println("-------------");

        livros.forEach(l -> System.out.println(l.getNome()));

        for (Livro livro: livros) {
            System.out.println(livro.getNome());
        }

        System.out.println("-------------");

        List<Livro> filtrados = new ArrayList<>();
        for (Livro livro: livros) {
            if (livro.getNome().contains("Java")){
                filtrados.add(livro);
            }
        }

        for (Livro livro: filtrados) {
            System.out.println(livro);
        }

        System.out.println("-------------");

        Stream<Livro> stream = livros.stream();

        livros.stream().filter(l -> l.getNome().contains("Java"));
//        for (Livro livro: livros) {
//            System.out.println(livro.getNome());
//        }
        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));
    }
}
