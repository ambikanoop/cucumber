package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
	
	static WebDriver driver;
	
	public HomePage() {
		super(driver=BaseTest.getDriver("Edge"));	
		addObject("Home",By.xpath("//a[contains(text(),'Home')]"));
		addObject("FirstName",By.id("name"));
		addObject("FatherName",By.id("lname"));
		addObject("Female",By.xpath("//input[@value='female']"));
		addObject("Male",By.xpath("//input[@value='male']"));
		
		
		
		
		
		
	}

}
