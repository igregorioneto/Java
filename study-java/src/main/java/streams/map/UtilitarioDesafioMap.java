package streams.map;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UtilitarioDesafioMap {
    private UtilitarioDesafioMap() {}

    public final static Function<Integer, String> converterBinario = n -> Integer.toBinaryString(n);

    public final static UnaryOperator<String> revertendoString = n -> {
      StringBuffer sb = new StringBuffer(n).reverse();
      return String.valueOf(sb);
    };

    public final static Function<String, Integer> converterBinarioEmInteiro = n -> Integer.parseInt(n, 2);
}
