package com.cucumber.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest{
	BasePage page;
	PageFactory pageFactory = new PageFactory();

	
	
	@Given("User launch the application in {string}")
	public void user_launch_the_application_in(String browsername) {
	    lauchapplication(browsername);
	}
	
	@Then("User waits for Element {string}")
	public void user_waits_for_element(String logicalName) {
	   page.waitforElement(logicalName);
	}
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
	  page = pageFactory.initialize(pageName);
	}

	
	@Then("User Enter into the text box {string} {string}")
	public void user_enter_into_the_text_box(String logicalName, String value) {
		page.enterIntoTextBox(logicalName, value);
	}
	
	@Then("Click on the button {string}")
	public void click_on_the_button(String logicalName) {
	  page.clickonButton(logicalName);
	}
	
	@Then("User Click on a RadioButton  {string}")
	public void user_click_on_a_radio_button(String logicalName) {
	    page.clickonRadioButton(logicalName);
	}
	
	@Then("User verifies the Message {string} {string}")
	public void user_verifies_the_message(String LogicalName, String expectedText) {
		page.validateText(LogicalName,expectedText);
	    
	}

	@After
	public void teardown(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png",scenario.getName());
		
		
		driver.close();
		driver=null;
	}
	
}
