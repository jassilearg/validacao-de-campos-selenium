package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

    public static WebDriver createChrome() {
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://homero.app.br/login"); 

        return navegador;
    }
}
