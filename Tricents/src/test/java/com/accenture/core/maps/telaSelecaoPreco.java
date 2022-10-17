package com.accenture.core.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import drivers.DriverWeb;

public class telaSelecaoPreco {
	
	WebDriver driver;
	
	public telaSelecaoPreco() {
		this.driver = DriverWeb.getDriver();
	}
	
	public void selecionarPlano(String string) {
		if(string.equals("Silver")) {
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]")).click();
		} else if(string.equals("Gold")) {
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]")).click();
		} else if(string.equals("Platinum")) {
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]")).click();
		} else if (string.equals("Ultimate")) {
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();;
		}
	}
	
	public void clicarBotaoNext() {
		driver.findElement(By.id("nextsendquote")).click();
	}	
}
