
package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


// clase 1 y 3
public class GoogleSearchTest {
	
	private WebDriver driver;
	By videoLinkLocator= By.cssSelector("a[href='https://www.youtube.com/watch?v=R_hh3jAqn8M']");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testGooglePage() {
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.clear(); // esto limpia lo que se haya escrito
		searchbox.sendKeys("quality stream Introduccion a la automatizacion de pruebas de software");
		searchbox.submit();
		// implicit wait nos permite esperar que uno o varios elemetos de la pagina si pasa lanza una excepcion
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//WebDriverWait ewait= new WebDriverWait(driver, 10); // a esta funcion se le pasa el robot y los segundos
		//ewait.until(ExpectedConditions.titleContains("quality stream")); // aca lo que hace es cada 0,5 segundos pregunta por si se encuentra el titulo		
		//assertEquals("quality stream Introduccion a la automatizacion de pruebas de software - Buscar con Google",driver.getTitle());
		
		// Fluent waits ---> generalmente se usa para llamadas asicronas(Ajax) donde los elementos de una pagina tiene un tiempo de carga muy variable y nos dan mas manejo porque.
	
		Wait<WebDriver> fwait= new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS); 
		WebElement video= fwait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
			return driver.findElement(videoLinkLocator);	
			}
		});
		
		assertTrue(driver.findElement(videoLinkLocator).isDisplayed());
	}
	@After
	
	
	public void tearDown() {
	 //	driver.quit();
	}

	
}

