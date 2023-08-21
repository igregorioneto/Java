package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Ana");
        resultadoConcurso.adicionar(2, "Gui");
        resultadoConcurso.adicionar(3, "Luna");
        resultadoConcurso.adicionar(2, "Luana");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(3));
    }
}
