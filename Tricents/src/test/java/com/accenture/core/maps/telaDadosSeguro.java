package com.accenture.core.maps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class telaDadosSeguro {
	
	private WebDriver driver;
	
	public telaDadosSeguro() {
		this.driver = DriverWeb.getDriver();
	}
	
	public void preencherNome(String string) {
		driver.findElement(By.id("firstname")).sendKeys(string);			
	}
	
	public void preencherSobrenome(String string) {
		driver.findElement(By.id("lastname")).sendKeys(string);			
	}
	
	public void preencherDataNascimento(String string) {
		driver.findElement(By.id("birthdate")).sendKeys(string);			
	}
	
	public void selecionarSexo(String string) {
		WebElement listaItens = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p"));
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
	
	public void preencherRuaEndereco(String string) {
		driver.findElement(By.id("streetaddress")).sendKeys(string);			
	}
	
	public void selecionarPais(String string) {
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText(string);
	}
	
	public void preencherCepEndereco(String string) {
		driver.findElement(By.id("zipcode")).sendKeys(string);			
	}
	
	public void preencherCidadeEndereco(String string) {
		driver.findElement(By.id("city")).sendKeys(string);			
	}
	
	public void selecionarOcupacao(String string) {
		Select select = new Select(driver.findElement(By.id("occupation")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarHobbi(String string) {
		WebElement listaItens = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p"));
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
	
	public void preencherSite(String string) {
		driver.findElement(By.id("website")).sendKeys(string);			
	}
	
	public void clicarNext() {
		driver.findElement(By.id("nextenterproductdata")).click();			
	}
			
}
