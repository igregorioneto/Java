package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lia", "Gui", "Ana", "Luca");

        System.out.println("Imprimindo da forma tradicional");
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("\nImprimindo com Iterator");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nImprimindo com Streams");
        Stream<String> stream = nomes.stream();
        stream.forEach(System.out::println);
    }
}
