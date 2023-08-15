package lambda.functional_interface;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                produto -> produto.preco * (1 - produto.desconto) >= 750;
        Produto produto = new Produto("Notebook", 4000, 0.15);
        System.out.println(isCaro.test(produto));

        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isNumeroTresDigitos = n -> n >= 100 && n <= 999;
        System.out.println(isPar.and(isNumeroTresDigitos).test(122));
    }
}
