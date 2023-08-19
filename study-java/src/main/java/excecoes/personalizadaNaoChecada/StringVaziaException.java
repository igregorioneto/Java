package excecoes.personalizadaNaoChecada;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
    private String value;

    public StringVaziaException(String value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s esta vazio", value);
    }
}
