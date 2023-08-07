package oop.desafio_composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompras(Compra compra) {
        compras.add(compra);
    }

    void compras() {
        for (Compra c: compras) {
            System.out.println(c);
        }
    }

    double obterValorTotalDeCompras() {
        double total = 0;
        for (Compra c: compras) {
            total += c.obterValorTotalDosItems();
        }
        return total;
    }
}
