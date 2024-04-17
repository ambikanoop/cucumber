package com.cucumber.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.cucumber.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	
	static PropertiesFile prop = new PropertiesFile();
	
	public static void lauchapplication(String browsername) {
		driver = getDriver(browsername);
		String applicationurl =  prop.getproperties("url");
		driver.get(applicationurl);
	}
	
	public static WebDriver getDriver(String browsername) {
	if (driver==null) {
		if(browsername.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		}
		return driver;
	}

}
