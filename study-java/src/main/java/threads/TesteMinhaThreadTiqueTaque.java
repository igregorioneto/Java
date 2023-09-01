package threads;

public class TesteMinhaThreadTiqueTaque {
    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        MinhaThreadTiqueTaque tique = new MinhaThreadTiqueTaque(tt, "Tique");
        MinhaThreadTiqueTaque taque = new MinhaThreadTiqueTaque(tt, "Taque");

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
