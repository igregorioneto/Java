package taskit.testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste de cadastro de usuário no site Task It")
public class TesteCadastro {

    @Test
    @DisplayName("Testando o cadastro")
    void testandoCadastroDeUsuarioNoSiteTaskIt() {
        // Abrir um navegador e ir até o site para testes
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.juliodelima.com.br/taskit/");
        // Preencher os dados nos campos referentes para poder cadastrar um usuário
        navegador.findElement(By.id("name-sign-up")).sendKeys("Testes Java");
        navegador.findElement(By.id("login-sign-up")).sendKeys("testes_java_testes");
        navegador.findElement(By.id("password-sign-up")).sendKeys("testesjavatestes");
        navegador.findElement(By.id("btn-submit-sign-up")).click();
    }

}
