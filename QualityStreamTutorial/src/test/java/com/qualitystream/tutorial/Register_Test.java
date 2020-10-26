package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
// esto lo creo yenfo a new oders busco junit y alli elegio testcase
public class Register_Test {
	private WebDriver driver;
	PageRegister page_register;

	@Before
	public void setUp() throws Exception {
		//Inicializo la variable
		page_register= new PageRegister(driver);
		driver= page_register.connection();
		page_register.visit("http://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
		
		
	}

	@Test
	public void test() throws InterruptedException {
		page_register.registerUser();
	}

}
