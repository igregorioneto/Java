package desafio_ClazzToBeTested;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.study.ClazzToBeTested;

@DisplayName("Testando a Classe ClazzToBeTested")
public class TesteClassToBeTested {

    @Test
    void testeSimplesInicial() {
        ClazzToBeTested tested = new ClazzToBeTested();
        String m = tested.sendGcdByMail("Teste");
        Assertions.assertEquals("From: Teste Content: To: eu@teste.com10um monte de coisa", m);
    }

    @Test
    void testeSimplesInicialDestubatartNull() {
        ClazzToBeTested tested = new ClazzToBeTested();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tested.sendGcdByMail();
        });
    }
}
