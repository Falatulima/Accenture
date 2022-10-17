package com.accenture.core.Steps;

import com.accenture.core.maps.telaEnviarCotacao;
import com.accenture.core.maps.telaSelecaoPreco;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class preencherDadosContato {

	private telaEnviarCotacao telaEnviarCotacao;
	
	@Given("Estou na tela enviar cotação")
	public void Estou_na_tela_enviar_cotação() {
		telaEnviarCotacao = new telaEnviarCotacao();
	}
	
	@When("Informo o email de contato com {string}")
	public void Informo_o_email_de_contato_com (String string)	{
		telaEnviarCotacao.preencherEmail(string);
	}
	
	@Then("Informo o telefone com {string}")
	public void Informo_o_telefone_com (String string)	{
		telaEnviarCotacao.preencherTelefone(string);
	}
	
	@And("Informo um usuário com {string}")
	public void Informo_um_usuário_com (String string)	{
		telaEnviarCotacao.preencherNomeUsuario(string);
	}
	
	@And("Informo uma senha com {string}")
	public void Informo_uma_senha_com (String string)	{
		telaEnviarCotacao.preencherSenha(string);
	}
	
	@And("Informo a confirmacao de senha com {string}")
	public void Informo_a_confirmacao_de_senha_com (String string)	{
		telaEnviarCotacao.confirmarSenha(string);
	}
	
	@And("Insiro os comentários com {string}")
	public void Insiro_os_comentários_com (String string)	{
		telaEnviarCotacao.preencherComentarios(string);
	}
	
	@And("Clico em Send na tela de enviar cotação")
	public void Clico_em_Send_na_tela_de_enviar_cotação()	{
		telaEnviarCotacao.clicarBotaoSend();
	}
	
	@Then("Clico no OK do modal de enviado com sucesso")
	public void Clico_no_OK_do_modal_de_enviado_com_sucesso()	{
		telaEnviarCotacao.clicarBotaoOK();
	}
	
	@Then("Finalizo a cotação") 
	public void Finalizo_a_cotação(){
		telaEnviarCotacao.finalizarCotacao();
	}
}
