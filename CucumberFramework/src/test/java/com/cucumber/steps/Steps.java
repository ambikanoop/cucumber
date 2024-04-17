package com.cucumber.steps;

import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest{
	BasePage page;
	PageFactory pageFactory=new PageFactory();

@Given("User launch the application in {string}")
public void user_launch_the_application_in(String browsername) {
	lauchapplication(browsername);
}
@Given("User is on {string}")
public void user_is_on(String pageName) {
	page = pageFactory.initialize(pageName);
}
@Then("User waits for Element {string}")
public void user_waits_for_element(String logicalname) {
    
}
@Then("User Enter into the text box {string} {string}")
public void user_enter_into_the_text_box(String logicalname, String value) {
    page.enterIntoTextBox(logicalname, value);
}
@Then("Click on the button {string}")
public void click_on_the_button(String logicalname) {
    page.clickonButton(logicalname);
}

}
