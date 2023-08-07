package oop.desafio_composicao;

public class Sistema {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Geladeira", 4500);

        Item item1 = new Item(p1, 2);
        Item item2 = new Item(p2, 2);

        Compra c1 = new Compra();
        c1.adicionarProduto(item1);
        c1.adicionarProduto(item2);

        Cliente cliente = new Cliente("João");
        cliente.adicionarCompras(c1);
        System.out.println(c1.obterValorTotalDosItems());
    }
}
