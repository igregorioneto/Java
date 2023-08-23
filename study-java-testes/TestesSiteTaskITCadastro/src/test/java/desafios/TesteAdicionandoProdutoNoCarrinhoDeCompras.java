package desafios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DisplayName("Carrinho de compras")
public class TesteAdicionandoProdutoNoCarrinhoDeCompras {

    @Test
    @DisplayName("Testando o adicionar item no carrinho")
    void testeAdicionandoProdutoCarrinho() {
        // Abrir o navegador e entrar no site https://demowebshop.tricentis.com/
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://demowebshop.tricentis.com/");

        // Capturar as informações do elemento data-productid
        WebElement dataProductId = navegador.findElement(By.cssSelector("div[data-productid]"));

        String dataProductIdName = dataProductId.getAttribute("data-productid");
        Assertions.assertEquals("2", dataProductIdName);

        // clicar no botão product-box-add-to-cart-button que é um INPUT
        WebElement details = dataProductId.findElement(By.className("details"));
        WebElement title = details.findElement(By.className("product-title"));
        WebElement tagA = title.findElement(By.cssSelector("a"));

        WebElement addInfo = details.findElement(By.className("add-info"));
        WebElement buttons = addInfo.findElement(By.className("product-box-add-to-cart-button"));
        String buttonAdd = buttons.getAttribute("value");

        // Clicar no botão do INPUT e navegar para a página do produto para adicionar
        if ("Add to cart".equalsIgnoreCase(buttonAdd)) {
            buttons.click();
        }
        Assertions.assertEquals("input", buttons.getTagName());

        // Escolher a quantidade do produto e adicionar no carrinho
        Duration timeOutDuration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(navegador, timeOutDuration);
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/25-virtual-gift-card"));

        String pageProduct = navegador.getCurrentUrl();
        Assertions.assertEquals("https://demowebshop.tricentis.com/25-virtual-gift-card", pageProduct);

        WebElement painelAddToCart = navegador.findElement(By.className("add-to-cart-panel"));
        WebElement painelQty = painelAddToCart.findElement(By.className("qty-input"));
        painelQty.clear();
        painelQty.sendKeys("2");
        String painelQtyValues = painelQty.getAttribute("value");
        Assertions.assertEquals("2", painelQtyValues);

        WebElement buttonToCart = painelAddToCart.findElement(By.id("add-to-cart-button-2"));
        String textButtonToCart = buttonToCart.getAttribute("value");
        Assertions.assertEquals("Add to cart", textButtonToCart);
        if ("Add to cart".equalsIgnoreCase(textButtonToCart)) {
            buttonToCart.click();
        }

        WebElement barNotificationError = navegador.findElement(By.id("bar-notification"));
        System.out.println(barNotificationError.getAttribute("style"));
    }

}
