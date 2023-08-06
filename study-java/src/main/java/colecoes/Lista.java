package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));

        System.out.println(">>>> Usuário removido " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Usuário existe? " + lista.contains(new Usuario("Lia")));
        System.out.println("Usuário existe? " + lista.contains(u1));

        for (Usuario u: lista) {
            System.out.println(u);
        }
    }
}
