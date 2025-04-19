package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utils.elementUtils;

public class LoginPage {
	
	WebDriver driver;
	
	elementUtils eu = new elementUtils(driver);
	
	 @FindBy(xpath = "//button[@type='button']")
	    private WebElement staff;
	 
	 @FindBy(id = "i0116")
	 private WebElement email;
	 
	 @FindBy(id ="idSIButton9")
	 private WebElement next;
	 
	 @FindBy(id ="i0118")
	 private WebElement pwd;
	 
	 @FindBy(xpath = "//input[@type='submit']")
	 WebElement signin;
	 
	 @FindBy(xpath = "//input[@class='win-button button_primary high-contrast-overrides button ext-button primary ext-primary']")
	 WebElement yes;
	 
	 @FindBy(xpath = "//span[text()='PCD Dashboard']")
	 WebElement dashboard;
	 
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		 PageFactory.initElements(driver, this);
	}

	public void clickStaffAD() {
		 eu.clickElement(staff);
		//staff.click();
		
	 }
	 
	 public void enterEmail(String ema) {
		 
		 eu.enterText(email, ema);
		 eu.clickElement(next);
	 }
	 
	 public void enterPassword(String pass) {
		 eu.enterText(pwd, pass);
	 }
	 
	 public void clickSignIn() throws InterruptedException {
		 Thread.sleep(2000);
		 eu.clickElement(signin);
		 eu.clickElement(yes);
	 } 
	 
	 public boolean loginTestPass() {
		 return dashboard.isDisplayed();
	 }
	 
	 
	 
	 

}
