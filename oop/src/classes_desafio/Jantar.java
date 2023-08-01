package classes_desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João", 70);
		pessoa.imprimirDados();
		Comida co1 = new Comida("Feijão", 0.5);
		
		pessoa.comer(co1);
		
		pessoa.imprimirDados();

	}

}
