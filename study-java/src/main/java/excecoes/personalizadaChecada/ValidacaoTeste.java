package excecoes.personalizadaChecada;

public class ValidacaoTeste {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", 17);
            Validacao.aluno(aluno);
            Validacao.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaDoIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
