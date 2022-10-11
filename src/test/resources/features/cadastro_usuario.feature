# language: pt


  @cadastro
  Funcionalidade: Cadastro de usuário
   Eu como novo usuário
   quero me cadastrar na aplicação
   para poder realizar compras


   @cadastro-sucesso
    Cenário: Registrar novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando eu preencho formulário de cadastro
    E clico em registrar
    Então eu vejo cadastro realizado com sucesso

   @cadastro-sucesso2
   Cenário: Registrar novo usuário com sucesso2
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando eu preencho formulário de cadastro
    E clico em registrar
    Então eu vejo cadastro realizado com sucesso
