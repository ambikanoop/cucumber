package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver("Edge"));	
		addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login",By.id("Login"));
		
	}

}
