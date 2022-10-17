package com.accenture.core.maps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class telaDadosVeiculo {

	private WebDriver driver;
	
	
	public telaDadosVeiculo() {
		this.driver = DriverWeb.getDriver();
	}
	
	public void clicarMenu() {
		driver.findElement(By.id("nav_automobile")).click();
			
	}

	public void selecionarMarca(String string) {
		Select select = new Select(driver.findElement(By.id("make")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarModelo(String string) {
		Select select = new Select(driver.findElement(By.id("model")));
		select.selectByVisibleText(string);
	}

	public void preencherCilindrada(String string) {
		driver.findElement(By.id("cylindercapacity")).sendKeys(string);			
	}
	
	public void preencherPotencia(String string) {
		driver.findElement(By.id("engineperformance")).sendKeys(string);			
	}
	
	public void preencherDataFabricacao(String string) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(string);
	}
	
	public void selecionarNumeroDeAssentos(String string) {
		Select select = new Select(driver.findElement(By.id("numberofseats")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarMaoDireita(String string) {
		WebElement listaItens = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p"));
		List<WebElement> Itens = listaItens.findElements(By.className("ideal-radiocheck-label"));
		
			WebElement itemAtual;
			int i = 0;
			while(i < Itens.size()) {
			itemAtual = Itens.get(i);
			if (itemAtual.getText().equals(string)) {
				itemAtual.click();
				 break;
			} i++;
		}
	}
	
	public void selecionarAssentosMoto(String string) {
		Select select = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		select.selectByVisibleText(string);
	}
	
	
	public void selecionarTipoDeCombustivel(String string) {
		Select select = new Select(driver.findElement(By.id("fuel")));
		select.selectByVisibleText(string);
	}
	
	public void preencherCargaUtil(String string) {
		driver.findElement(By.id("payload")).sendKeys(string);			
	}
	
	public void preencherPeso(String string) {
		driver.findElement(By.id("totalweight")).sendKeys(string);			
	}
	
	public void preencherValor(String string) {
		driver.findElement(By.id("listprice")).sendKeys(string);			
	}
	
	public void preencherPlaca(String string) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(string);			
	}
	
	public void preencherMilhagemAnual(String string) {
		driver.findElement(By.id("annualmileage")).sendKeys(string);			
	}
	
	public void clicarBotaoNext() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}	

}
