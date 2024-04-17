package com.cucumber.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterIntoTextBox(String logicalName, String value) {
	WebElement element =getElement(logicalName);
	element.sendKeys(value);
	
	}
	
	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
	}
	
	
	public WebElement getElement(String logicalName) {
		By by = ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element ;
	}

	public void clickonButton(String logicalName) {
		WebElement element = getElement(logicalName);
		
		element.click();
	}

	public void waitforElement(String logicalName) {
		WebElement element = getElement(logicalName);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void clickonRadioButton(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
		
	}
	

}
