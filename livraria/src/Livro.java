public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public void aplicarDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if(this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }
}
