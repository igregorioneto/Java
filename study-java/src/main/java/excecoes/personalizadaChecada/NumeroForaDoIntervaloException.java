package excecoes.personalizadaChecada;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception{
    private String value;

    public NumeroForaDoIntervaloException(String value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return String.format("A variável %s esta fora do intervalo", value);
    }

}
