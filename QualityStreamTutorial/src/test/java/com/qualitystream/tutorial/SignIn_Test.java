package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test {
	private WebDriver driver;
	SignInPage signin;

	@Before
	public void setUp() throws Exception {
		signin= new SignInPage(driver);
		driver= signin.connection();
		signin.visit("http://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		signin.SignIn();
	}

}
