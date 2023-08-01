package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4300;
		
		Produto.desconto = 0.50;
		
		double precoFinal = p1.precoComDesconto();
		
		System.out.printf("Preço com desconto do produto p1: " + precoFinal);

	}

}
