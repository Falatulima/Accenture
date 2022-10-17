package com.accenture.core.Steps;

import com.accenture.core.maps.telaDadosProduto;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class preencherDadosProduto {

	private telaDadosProduto telaDadosProduto;
	
	@Given("Estou na tela de Dados do Produto")
	public void Estou_na_tela_de_Dados_do_Produto() {
		telaDadosProduto = new telaDadosProduto();
	}
	
	@When("Informo a data de início com {string}") 
	public void Informo_a_data_de_início_com (String string) {
		telaDadosProduto.preencherDataInicio(string);
	}

	@Then("Seleciono o soma do seguro com {string}") 
	public void Seleciono_o_soma_do_seguro_com (String string) {
		telaDadosProduto.selecionarSomaSeguro(string);	
	}
	
	@And("Seleciono o bonus do seguro com {string}") 
	public void Seleciono_o_bonus_do_seguro_com (String string) {
		telaDadosProduto.selecionarBonusSeguro(string);		
	}
	
	@And("Seleciono cobertura de Danos com {string}") 
	public void Seleciono_cobertura_de_Danos_com  (String string) {
		telaDadosProduto.selecionarCoberturaDanos(string);		
	}
	
	@And("Seleciono os produtos opcionais com {string}") 
	public void Seleciono_os_produtos_opcionais_com (String string) {
		telaDadosProduto.selecionarProdutoOpcional(string);		
	}
	
	@And("Seleciono carro de cortesia {string}") 
	public void Seleciono_carro_de_cortesia (String string) {
		telaDadosProduto.selecionarCarroCortesia(string);		
	}
	
	@Then("Clico em Next na tela de Dados do Produto") 
	public void Clico_em_Next_na_tela_de_Dados_do_Produto () {
		telaDadosProduto.clicarNext();
	}
	
}
