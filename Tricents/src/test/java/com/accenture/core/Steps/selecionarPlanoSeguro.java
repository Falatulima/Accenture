package com.accenture.core.Steps;

import com.accenture.core.maps.telaDadosProduto;
import com.accenture.core.maps.telaSelecaoPreco;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selecionarPlanoSeguro {
	
	private telaSelecaoPreco telaSelecaoPreco;
	
	@Given("Estou na tela de seleção de preço")
	public void Estou_na_tela_de_seleção_de_preço() {
		telaSelecaoPreco = new telaSelecaoPreco();
	}
	
	@When("Seleciono o plano do seguro com {string}")
	public void Seleciono_o_plano_do_seguro_com (String string)	{
		telaSelecaoPreco.selecionarPlano(string);
	}
	
	@Then("Clico em Next na tela de seleção de preço")
	public void Clico_em_next_na_tela_de_seleção_de_preço()	{
		telaSelecaoPreco.clicarBotaoNext();
	}

}
