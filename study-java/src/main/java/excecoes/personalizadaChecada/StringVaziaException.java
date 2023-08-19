package excecoes.personalizadaChecada;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
    private String value;

    public StringVaziaException(String value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s esta vazio", value);
    }
}
