package classes;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(01,01,1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
