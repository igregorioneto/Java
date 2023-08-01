package classes_desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa() {}
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			peso += comida.peso;
		}		
	}
	
	void imprimirDados() {
		System.out.println("Nome: " + nome + ", Peso: " + peso);
	}

}
