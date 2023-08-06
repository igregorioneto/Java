package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");

        for (String u: usuarios.values()) {
            System.out.println(u);
        }

        for (Integer i: usuarios.keySet()) {
            System.out.println(i);
        }

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Roberto"));
    }
}
