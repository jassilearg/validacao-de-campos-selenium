package pages;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class PreLogin extends BasePage {
    Faker faker = new Faker();

    public PreLogin(WebDriver navegador) {
        super(navegador);
    }

    public PreLogin email() {
        navegador.findElement(By.id("username-input")).sendKeys(faker.internet().emailAddress());
        return this;
    }

    public PreLogin loginButton() {
        navegador.findElement(By.xpath("//*[@id=\"app\"]/main/section/div/section[1]/div/form/div[2]/button")).click();
        return this;
    }

    public PreLogin errorMessage() {
        String errorMsg = navegador.findElement(By.id("error-msg")).getText();
        assertTrue("A mensagem de erro não corresponde.", errorMsg.contains("Esse campo é obrigatório"));
        return this;
    }

    public LoginPage page() {
        return new LoginPage(navegador);
    }
}
