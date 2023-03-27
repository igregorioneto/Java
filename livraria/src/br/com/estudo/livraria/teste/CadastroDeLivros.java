package br.com.estudo.livraria.teste;

import br.com.estudo.livraria.Autor;
import br.com.estudo.livraria.produtos.Livro;
import br.com.estudo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("João Silva");
        autor.setEmail("joaosilva@gmail.com");
        autor.setCpf("123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

//        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Maria Silva");
        outroAutor.setEmail("mariasilva@gmail.com");
        outroAutor.setCpf("123.456.789.10");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);

//        outroLivro.mostrarDetalhes();
    }
}
