package excecoes;

public class ChecadaENaoChecada {
    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            gerarErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    static void gerarErro1() {
        throw new RuntimeException("Ocorreu um error 01");
    }

    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um error 02");
    }
}
