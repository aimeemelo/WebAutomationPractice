package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;
import support.Utils;


public class LoginStep extends RunCucumberTest {

    LoginPage loginPage =  new pages.LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login()  {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();

    }
    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário()  {
        loginPage.preencherCampoEmail(Utils.getRandomEmail());
        loginPage.clicarEmCriarContaBotao();

    }
}
