package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream()
                .map(UtilitarioDesafioMap.converterBinario)
                .map(UtilitarioDesafioMap.revertendoString)
                .map(UtilitarioDesafioMap.converterBinarioEmInteiro)
                .forEach(print);
    }
}
