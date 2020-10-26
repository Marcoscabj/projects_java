package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	// Aca ponemos los localizadores

	
	private WebDriver driver;
	// Aca hacemos el registro
	By registerLinkLocator = By.linkText("REGISTER");	
	By registerPageLocator = By.xpath("//img[@src=\"images/mast_register.gif\"]"); // este sirve para ver si la pagina actual esta cargada
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	// ahora utilizo un valor de css selector
	By confirmPassword = By.cssSelector("input[name=\"confirmPassword\"]");
	By confirmBtnRegister= By.name("submit");
	//  en ingreso o sign-in
	By userLocator= By.name("userName");
	By passLocator= By.name("password");
	By Login= By.name("submit");
	public Base(WebDriver driver) {
	 this.driver= driver;
		
	}
	// Creamos un megtodo para la conexion con wedriver
	public WebDriver connection() {
		// setamos la property
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	} 
	// aca lo que hacemos es buscar el valor par a luego pasarl la variable
	
	// aca se hace esto porque si para un cambio de version en vez de cambiar todo el version y cambia el nombre del metodo solo cambiamos el nombre de uno
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		// este ces distinto al anterior porque llama a varios metodos
		return driver.findElements(locator);
	}
	// para devolver el elemento del texto que estamos pasando como parametro
	public String getText(WebElement element){
		return element.getText();
	}
	// aca podemos aplicar la sobrecarga, en este caso lo que cambia es que le pasamos un localizador
	public String getText(By locator){
		return driver.findElement(locator).getText();
	}
	
	// ahora mandamos para escribir
	public void Type(String InputText, By locator) {
	driver.findElement(locator).sendKeys(InputText);
	}
	public void click(By locator){
		driver.findElement(locator).click();
	}
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();// esto me da un booleano 
		}catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
		
		// falta en metodo get que es el encargado de abrir la pagina y recibir la url 
		
		}
	// falta en metodo get que es el encargado de abrir la pagina y recibir la url 
	public void visit(String url){
		driver.get(url);
}
	// ahora creamos las clases del tipo page

}
