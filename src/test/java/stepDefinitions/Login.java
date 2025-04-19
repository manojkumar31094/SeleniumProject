package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.LoginPage;

public class Login {
	
	DriverFactory df = new DriverFactory();
	
	WebDriver driver;
	LoginPage lp;
	
	
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

}
