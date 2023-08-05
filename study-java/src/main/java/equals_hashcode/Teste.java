package equals_hashcode;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "João";
        u1.email = "joao@teste.com";

        Usuario u2 = new Usuario();
        u2.nome = "João";
        u2.email = "joao@teste.com";

        System.out.println(u1 == u2); // false
        System.out.println(u1.equals(u2)); // true
        System.out.println(u2.equals(u1)); // true
    }
}
