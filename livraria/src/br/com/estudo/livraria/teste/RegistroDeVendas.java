package br.com.estudo.livraria.teste;

import br.com.estudo.livraria.Autor;
import br.com.estudo.livraria.produtos.CarrinhoDeCompras;
import br.com.estudo.livraria.produtos.Ebook;
import br.com.estudo.livraria.produtos.LivroFisico;
import br.com.estudo.livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("João Silva");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test-Driven Development");
        livroFisico.setValor(59.90);

        if (livroFisico.aplicarDescontoDe10Porcento()) {
            System.out.println(livroFisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(livroFisico);
        carrinhoDeCompras.adiciona(ebook);

        System.out.println("Total: " + carrinhoDeCompras.getTotal());

        List<Produto> produtos = carrinhoDeCompras.getProdutos();

        for (Produto produto: produtos) {
            try {
                if (produto != null)
                    System.out.println(produto.getValor());
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Gerou um erro aqui: " + e);
            }catch (NullPointerException e){
                System.out.println("O Array não foi instanciado!");
            }catch(Exception e ) {
                e.printStackTrace();
            }finally {
                System.out.println("Entrou no finally!");
            }
        }

    }
}
