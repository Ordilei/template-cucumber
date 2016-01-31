package template_cucumber.template_cucumber;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSteps {
	
	public static WebDriver driver;
	
	@Dado("^que eu esteja na pagina \"([^\"]*)\"$")
	public void que_eu_esteja_na_pagina(String url) throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
	}

	@Quando("^eu preencho \"([^\"]*)\" com \"([^\"]*)\"$")
	public void eu_preencho_com(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id(arg1)).sendKeys(arg2);
	}

	@Quando("^eu clico em \"([^\"]*)\"$")
	public void eu_clico_em(String arg1) throws Throwable {
		driver.findElement(By.id(arg1)).click();
	}

	@Entao("^eu devo ver \"([^\"]*)\" dentro de \"([^\"]*)\"$")
	public void eu_devo_ver_dentro_de(String arg1, String arg2) throws Throwable {
		String text = driver.findElement(By.id(arg2)).getText();
		Assert.assertEquals(arg1, text);
	}

}
