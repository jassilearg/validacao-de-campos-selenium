import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PreLogin;
import support.Web;

public class LoginSemSenha {
    private WebDriver navegador;

    @BeforeTest
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void login() {
        new PreLogin(navegador)
                .email()
                .loginButton()
                .errorMessage()
                .page();
    }

    @AfterTest
    public void tearDown() {
        navegador.quit();
    }
}
