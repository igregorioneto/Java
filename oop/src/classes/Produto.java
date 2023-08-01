package classes;

public class Produto {
	
	String nome;
	double preco;
	//final static double desconto = 0.25;
	static double desconto = 0.25;
	
	Produto() {}
	
	Produto(String nomeProduto, double precoProduto) {
		nome = nomeProduto;
		preco = precoProduto;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}
