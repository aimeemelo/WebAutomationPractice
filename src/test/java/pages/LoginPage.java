package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;


public class LoginPage extends RunCucumberTest {


    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        getDriver().manage().window().maximize();
        Utils.esperarElementoEstarPresente(create_email_field,10);

    }

    public void preencherCampoEmail(String randomEmail) {
        getDriver().findElement(create_email_field).sendKeys(randomEmail);


    }

    public void clicarEmCriarContaBotao(){
        getDriver().findElement(create_email_button).click();

    }

}
