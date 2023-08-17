package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Gui", 8.0);
        Aluno a3 = new Aluno("Luna", 9.1);
        Aluno a4 = new Aluno("João", 6.9);
        Aluno a5 = new Aluno("Gabi", 6.9);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> notasAprovados = n -> n.nota;
        BinaryOperator<Double> soma = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovados)
                .map(notasAprovados)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
