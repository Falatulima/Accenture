package com.accenture.core.maps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverWeb;


public class telaEnviarCotacao {

private WebDriver driver;
	
	
	public telaEnviarCotacao() {
		this.driver = DriverWeb.getDriver();
	}
	
	public void preencherEmail(String string) {
		driver.findElement(By.id("email")).sendKeys(string);			
	}
	
	public void preencherTelefone(String string) {
		driver.findElement(By.id("phone")).sendKeys(string);			
	}
	
	public void preencherNomeUsuario(String string) {
		driver.findElement(By.id("username")).sendKeys(string);			
	}
	
	public void preencherSenha(String string) {
		driver.findElement(By.id("password")).sendKeys(string);			
	}
	
	public void confirmarSenha(String string) {
		driver.findElement(By.id("confirmpassword")).sendKeys(string);			
	}
	
	public void preencherComentarios(String string) {
		if(!string.isEmpty() || string != null) {
			driver.findElement(By.id("Comments")).sendKeys(string);	
		}
	}
	
	public void clicarBotaoSend() {
		driver.findElement(By.id("sendemail")).click();
	}	
	
	public void clicarBotaoOK() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoadingPDF")));
		WebElement sucesso = driver.findElement(By.xpath("/html/body/div[4]/h2"));
		String Texto = sucesso.getText();
		System.out.println("\n" + Texto + "\n");
		
		driver.findElement(By.className("confirm")).click();
	}
	
	public void finalizarCotacao() {
		DriverWeb.finalizar();
		System.out.println("\nTeste Finalizado com sucesso\n");
	}
	
}
