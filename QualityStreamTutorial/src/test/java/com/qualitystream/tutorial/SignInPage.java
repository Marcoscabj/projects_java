package com.qualitystream.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class SignInPage extends Base{
		//localizadores
		By userLocator= By.name("userName");
		By passLocator= By.name("password");
		By Login= By.name("submit");
	
		public SignInPage(WebDriver driver){
			super(driver);
		}
		public void SignIn() {
			if(isDisplayed(userLocator)){
				Type("12345",passLocator);
				click(Login);
			}else {
				System.out.println("page wasn't found");
			}
		}
}
