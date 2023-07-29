package classes;

public class DataTeste {

	public static void main(String[] args) {
		Data data = new Data();
		data.dia = 28;
		data.mes = 07;
		data.ano = 2023;
		System.out.printf("Data de hoje é %d/%d/%d\n", data.dia,data.mes, data.ano);
		System.out.println("Data de hoje é " + data.obterDataFormatada());

	}

}
