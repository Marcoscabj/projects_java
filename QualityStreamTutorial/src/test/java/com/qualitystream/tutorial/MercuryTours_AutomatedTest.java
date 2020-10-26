package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAndHoldAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");	
	By registerPageLocator = By.xpath("//img[@src=\"images/mast_register.gif\"]");
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	// ahora utilizo un valor de css selector
	By confirmPassword = By.cssSelector("input[name=\"confirmPassword\"]");
	By confirmBtnRegister= By.name("submit");
	By userLocator= By.name("userName");
	By passLocator= By.name("password");
	By Login= By.name("submit");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
	
	}

	@After
	public void tearDown() throws Exception {
	//driver.quit():
	}

	// first test
	@Test
	public void registerUser() throws InterruptedException {
	driver.findElement(registerLinkLocator).click(); // aca llamamos al robot que busque el elemento y por ultimo que de click
	Thread.sleep(10000);
	// aca lo que toma el elemento es este caso la imagen y si es afirmativa lo que hace es devolver true
	if(driver.findElement(registerPageLocator).isDisplayed()) 
	{
		driver.findElement(usernameLocator).sendKeys("marcos");
		driver.findElement(passwordLocator).sendKeys("pass1");
		driver.findElement(confirmPassword).sendKeys("pass1");
		driver.findElement(confirmBtnRegister).click();
	}else {
		System.out.println("page wasn't found");
	}
	// para maximizar tecla de window + tecla arriba
	// web element se llama la clase

	// paso de autenticar al usuario, creamos un nuevo text
	
	
	}
	// aca ejecuta en otro navegador
	@Test
	public void SingIn() throws InterruptedException{
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("marcos");
			driver.findElement(passLocator).sendKeys("pass1");
			driver.findElement(Login).click();
			/*
			List<WebElement> fonts= driver.findElements(By.tagName("font"));
			String value=fonts.get(6).getText();
			if(value=="Login Successfully"){
				System.out.print("success");
				
			}
			*/
		}
	// Veamos ahora el POM: SI ES SISTEMA SUFRE CAMBIOS EJEMPLO CAMBIOS DE CAMPOS 
		// SI HAY UNA MODIFICACION AFECTA A TODOS LOS TEST ENTONCES POM CREA UNA CAPA SE CREA UNA CLASE Y SE PONE LAS ACCIONES Y LOS SELECTORES POR ESO LO UNICO QUE HACEMOS ENS CAMBIAR LAS CLASES
		// BASE : SELENIUM WRAPPER: SI SELECCION CAMBIA LAS ACUALIZACION LO UNICO QUE HAREMOS EN CAMBIAR LA BASE
		
		
	}
}
