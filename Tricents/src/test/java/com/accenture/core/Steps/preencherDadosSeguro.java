package com.accenture.core.Steps;

import com.accenture.core.maps.telaDadosSeguro;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class preencherDadosSeguro {
	
	private telaDadosSeguro telaDadosSeguro;
	
	@Given("Estou na tela de Dados do Segurado")
	public void Estou_na_tela_de_Dados_do_Segurado() {
		telaDadosSeguro = new telaDadosSeguro();
	}
	
	@When("Informo nome com {string}") 
	public void Informo_nome_com (String string) {
		telaDadosSeguro.preencherNome(string);
	}
	
	@Then("Informo sobrenome com {string}") 
	public void Informo_sobrenome_com (String string) {
		telaDadosSeguro.preencherSobrenome(string);
	}

	@And("Informo data de nascimento com {string}") 
	public void Informo_data_de_nascimento_com (String string) {
		telaDadosSeguro.preencherDataNascimento(string);		
	}
	
	@Then("Seleciono o sexo com {string}") 
	public void Seleciono_o_sexo_com (String string) {
		telaDadosSeguro.selecionarSexo(string);	
	}
	
	@And("Informo a rua com {string}") 
	public void Informo_a_rua_com (String string) {
		telaDadosSeguro.preencherRuaEndereco(string);	
	}
	
	@Then("Seleciono o país com {string}") 
	public void Seleciono_o_país_com (String string) {
		telaDadosSeguro.selecionarPais(string);	
	}
	
	@And("Informo o CEP com {string}") 
	public void Informo_o_CEP_com (String string) {
		telaDadosSeguro.preencherCepEndereco(string);	
	}
	
	@And("Informo a Cidade com {string}") 
	public void Informo_a_Cidade_com (String string) {
		telaDadosSeguro.preencherCidadeEndereco(string);	
	}
	
	@Then("Seleciono ocupação com {string}") 
	public void Seleciono_ocupação_com (String string) {
		telaDadosSeguro.selecionarOcupacao(string);	
	}
	
	@And("Seleciono Hobbi com {string}") 
	public void Seleciono_Hobbi_com (String string) {
		telaDadosSeguro.selecionarHobbi(string);	
	
	}
	
	@And("Informo site com {string}") 
	public void Informo_site_com (String string) {
		telaDadosSeguro.preencherSite(string);	
	}
	
	@Then("Clico em Next na tela de Dados do Segurado") 
	public void Clico_em_Next_na_tela_de_Dados_do_Segurado () {
		telaDadosSeguro.clicarNext();	
	}
	
}
