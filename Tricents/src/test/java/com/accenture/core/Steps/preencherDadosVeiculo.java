package com.accenture.core.Steps;

import com.accenture.core.maps.telaDadosVeiculo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class preencherDadosVeiculo {

	private telaDadosVeiculo telaDadosVeiculo;
	
	
	@Given("Estou na tela do Tricentis")
	public void Estou_na_tela_do_Tricents() {
		telaDadosVeiculo = new telaDadosVeiculo();
	}
	
	@When("Clico para selecionar marca")
	public void Clico_para_selecionar_marca() {
		telaDadosVeiculo.clicarMenu();
	}
	
	@Then("Seleciono a marca com {string}")
	public void Seleciono_a_marca_com(String string) {
		telaDadosVeiculo.selecionarMarca(string);
	}
	
	@And("Seleciono o modelo com {string}")
	public void Seleciono_o_modelo_com(String string) {
		telaDadosVeiculo.selecionarMarca(string);
	}

	@Then("Informo a cilindrada com {string}")
	public void Informo_a_cilindrada_com (String string) {
		telaDadosVeiculo.preencherCilindrada(string);
	}
	
	@And("Informo a potencia com {string}")
	public void Informo_a_potencia_com (String string) {
		telaDadosVeiculo.preencherPotencia(string);
	}
	
	@And("Informo a data de fabricação com {string}")
	public void Informo_a_data_de_fabricação_com (String string) {
		telaDadosVeiculo.preencherDataFabricacao(string);
	}
	
	@Then("Seleciono o numero de assentos com {string}")
	public void seleciono_o_numero_de_assentos_com (String string) {
		telaDadosVeiculo.selecionarNumeroDeAssentos(string);
	}
	
	@And("Seleciono mão direita SIM ou NAO {string}")
	public void Seleciono_mãodireita_SIM_ou_NAO (String string) {
		telaDadosVeiculo.selecionarMaoDireita(string);
	}
	
	@And("Seleciono numero de assentos moto com {string}")
	public void Seleciono_numero_de_assentos_moto (String string) {
		telaDadosVeiculo.selecionarAssentosMoto(string);
	}
	
	@And("Seleciono tipo de combustivel {string}")
	public void Seleciono_tipo_de_combustivel (String string) {
		telaDadosVeiculo.selecionarTipoDeCombustivel(string);
	}
	
	@Then("Informo carga util {string}")
	public void Informo_carga_util (String string) {
		telaDadosVeiculo.preencherCargaUtil(string);
	}
	
	@And("Informo peso {string}")
	public void Informo_peso (String string) {
		telaDadosVeiculo.preencherCargaUtil(string);
	}
	
	@And("Informo valor {string}")
	public void Informo_valor (String string) {
		telaDadosVeiculo.preencherValor(string);
	}
	
	@And("informo placa {string}")
	public void informo_placa (String string) {
		telaDadosVeiculo.preencherPlaca(string);
	}
	
	@And("Informo milhagem anual {string}")
	public void Informo_milhagem_anual (String string) {
		telaDadosVeiculo.preencherMilhagemAnual(string);
	}
	
	@Then("Clico em Next na tela de Dados do veículo")
	public void Clico_em_Next_na_tela_de_Dados_do_veículo() {
		telaDadosVeiculo.clicarBotaoNext();
	}
	
	

}
