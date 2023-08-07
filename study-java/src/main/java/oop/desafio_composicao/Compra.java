package oop.desafio_composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> items = new ArrayList<>();

    void adicionarProduto(Item item) {
        items.add(item);
    }

    public double obterValorTotalDosItems() {
        double total = 0;
        for (Item i: items) {
            total += (i.quantidade * i.produto.price);
        }
        return total;
    }
}
