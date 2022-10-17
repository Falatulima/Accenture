package com.accenture.core.maps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class telaDadosProduto {
	
	private WebDriver driver;
	
	public telaDadosProduto() {
		this.driver = DriverWeb.getDriver();
	}
	
	public void preencherDataInicio(String string) {
		driver.findElement(By.id("startdate")).sendKeys(string);
	}
	
	public void selecionarSomaSeguro(String string) {
		Select select = new Select(driver.findElement(By.id("insurancesum")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarBonusSeguro(String string) {
		Select select = new Select(driver.findElement(By.id("meritrating")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarCoberturaDanos(String string) {
		Select select = new Select(driver.findElement(By.id("damageinsurance")));
		select.selectByVisibleText(string);
	}
	
	public void selecionarProdutoOpcional(String string) {
		WebElement listaItens = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p"));
		List<WebElement> itens = listaItens.findElements(By.className("ideal-radiocheck-label"));
		
			WebElement itemAtual;
			int i = 0;
			while(i < itens.size()) {
			itemAtual = itens.get(i);
			if(itemAtual.getText().equals(string)) {
				itemAtual.click();
				break;
			} i++;
		}
	}
	
	public void selecionarCarroCortesia(String string) {
		Select select = new Select(driver.findElement(By.id("courtesycar")));
		select.selectByVisibleText(string);
	}
	
	public void clicarNext() {
		driver.findElement(By.id("nextselectpriceoption")).click();			
	}

}
