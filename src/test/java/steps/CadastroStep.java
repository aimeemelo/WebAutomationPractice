package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class CadastroStep extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    String nome = "Jose";
    String sobrenome = "Ferreira";


    @Quando("^eu preencho formulário de cadastro$")
    public void eu_preencho_formulário_de_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.preencherNome(nome);
        cadastroPage.preencherSobrenome(sobrenome);
        cadastroPage.preencherPassword("010101iaiaia");
        cadastroPage.selecionarAniversário(01,9,"1990");
        cadastroPage.preencherAddress("av beira mar, 123");
        cadastroPage.preencherCity("Recife");
        cadastroPage.selecionarState("Colorado");
        cadastroPage.preencherPostalCode("88888");
        cadastroPage.preencherPhoneMobile("+55081999966666");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {
        cadastroPage.clickRegister();

    }

    @Então("^eu vejo cadastro realizado com sucesso$")
    public void eu_vejo_cadastro_realizado_com_sucesso()  {
        cadastroPage.validaCadastro(nome, sobrenome);


    }



}


