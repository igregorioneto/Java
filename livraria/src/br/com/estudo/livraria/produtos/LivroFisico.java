package br.com.estudo.livraria.produtos;

import br.com.estudo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.5;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3)
            return false;

        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto no br.com.estudo.livraria.produtos.LivroFisico");
        return true;
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor())
            return -1;
        if (this.getValor() > outro.getValor())
            return 1;
        return 0;
    }
}
