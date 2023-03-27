package br.com.estudo.livraria.produtos;

import br.com.estudo.livraria.Autor;
import br.com.estudo.livraria.exception.AutorNuloException;
import br.com.estudo.livraria.produtos.Produto;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this();
        if(autor == null)
            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
        this.autor = autor;
    }

    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    @Override
    public String toString() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if(this.temAutor()) {
            autor.toString();
        }

        System.out.println("--");
        return "";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
