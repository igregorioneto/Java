package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 8.5);
        Aluno a2 = new Aluno("Gui", 6.5);
        Aluno a3 = new Aluno("Ana", 9);
        Aluno a4 = new Aluno("Lucia", 7);
        Aluno a5 = new Aluno("Gabriela", 6.5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> mensagem = a -> "Parabéns " + a.nome + " você foi aprovado (a)!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
