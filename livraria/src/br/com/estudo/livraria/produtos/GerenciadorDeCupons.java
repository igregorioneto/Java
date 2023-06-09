package br.com.estudo.livraria.produtos;

import java.util.*;

public class GerenciadorDeCupons {
//    private Set<String> cupons;
    private Map<String, Double> cupons;
    public GerenciadorDeCupons() {
//        this.cupons = new HashSet<String>();
//        cupons.addAll(
//                Arrays.asList(
//                        "CUP74", "CUP158",
//                        "CUP14", "CUP52", "CUP21", "CUP221", "CUP91",
//                        "CUP327", "CUP410", "CUP275", "CUP484", "CUP207",
//                        "CUP96", "CUP119", "CUP174", "CUP291", "CUP1",
//                        "CUP115", "CUP222", "CUP272"
//                )
//        );
        this.cupons = new HashMap<>();

        cupons.put("cab11", 10.0);
        cupons.put("cab22", 12.0);
        cupons.put("cab33", 14.0);
        cupons.put("cab44", 16.0);
    }

    public boolean validaCupom2(String cupom) {
//        return this.cupons.contains(cupom);
        return this.cupons.containsKey(cupom);
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}
