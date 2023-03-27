package br.com.estudo.livraria.produtos;

import br.com.estudo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if(porcentagem > 0.15)
            return false;
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }

    @Override
    public boolean aplicarDescontoDe10Porcento() {
        return Promocional.super.aplicarDescontoDe10Porcento();
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor())
            return -1;
        if (this.getValor() > outro.getValor())
            return 1;
        return 0;
    }

    public String getWaterMark() {
        return this.waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
