package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.EditLoaDetails;
import pages.LoginPage;

public class Login {
	
	DriverFactory df = new DriverFactory();
	
	WebDriver driver;
	LoginPage lp;
	EditLoaDetails ed;
	
	
	@Then("Click on login with Staff AD button")
	public void click_on_login_with_staff_ad_button() {
	    driver =df.getDriver();
	    lp = new LoginPage(driver);
	    lp.clickStaffAD();
	    
	}
	
	@Then("Enter the user name {string}")
	public void enter_the_user_name(String string) {
		lp = new LoginPage(driver);
	    lp.enterEmail(string);
	}
	
	@Then("Enter the password {string}")
	public void enter_the_password(String string) {
		lp = new LoginPage(driver);
	    lp.enterPassword(string);
	}
	
	@Then("Click on the Sign in button")
	public void click_on_the_sign_in_button() throws InterruptedException {
		lp = new LoginPage(driver);
	    lp.clickSignIn();
	}
	
	@Then("User should see the Dashboard page")
	public void user_should_see_the_dashboard_page() {
		
		lp = new LoginPage(driver);
		Assert.assertTrue(lp.loginTestPass());
		
	}
	
	@Then("Enter the valid user name {string}")
	public void enter_the_valid_user_name(String string) {
		lp = new LoginPage(driver);
	    lp.enterEmail(string);
	}
	
	@Then("Enter the invalid password {string}")
	public void enter_the_invalid_password(String string) {
		lp = new LoginPage(driver);
	   lp.enterPassword(string);
	}
	
	@Then("User should see the error message")
	public void user_should_see_the_error_message() {
		lp = new LoginPage(driver);
	   Assert.assertTrue(lp.loginErrorMessage());
	}

	//---------------Edit LOA Details
	
	@Then("Click on the LOA in the side menu")
	public void click_on_the_loa_in_the_side_menu() throws InterruptedException {
		ed = new EditLoaDetails(driver);
		ed.clickLoaSideMenu();
	}
	
	@Then("Select an loa from the list")
	public void select_an_loa_from_the_list() {
		ed = new EditLoaDetails(driver);
		ed.selectLoa();
		
	}
	
	@Then("click on the edit button in the loa details")
	public void click_on_the_edit_button_in_the_loa_details() {
		ed = new EditLoaDetails(driver);
		ed.clickEditButton();
	}
	
	@Then("Edit the Email message {string}")
	public void edit_the_email_message(String string) {
		ed = new EditLoaDetails(driver);
		ed.editEmailMessage(string);
		
	}
	
	@Then("Click on the loa details save button")
	public void click_on_the_loa_details_save_button() {
		ed = new EditLoaDetails(driver);
		ed.clickOnSave();
	}



}
