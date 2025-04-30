package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.elementUtils;

public class EditLoaDetails {
	
	WebDriver driver;
	
	elementUtils eu = new elementUtils(driver);
	
	@FindBy (xpath = "(//span[@class='ant-menu-title-content'])[3]")
	WebElement loamenu;
	
	@FindBy (xpath = "//td[text()='000112']")
	WebElement sloa;
	
	@FindBy (xpath = "(//div[@class='ant-card-extra'])[1]")
	WebElement edit;
	
	//Email message field
	@FindBy (name = "emailMessage")
	WebElement emessage;
	
	// Email Subject
	@FindBy (name = "emailSubject")
	WebElement esubject;
	
	//Save button
	@FindBy (xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement save;
	
	
	
	
	
	public EditLoaDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLoaSideMenu() throws InterruptedException {
		Thread.sleep(9000);
		eu.clickElement(loamenu);
		//loamenu.click();
		
	}
	
	public void selectLoa() {
		eu.clickElement(sloa);
	}
	
	public void clickEditButton() {
		eu.clickElement(edit);
	}
	
	public void editEmailMessage(String em) {
		eu.clickElement(emessage);
		eu.clearText(emessage);
		eu.enterText(emessage, em);
	}
	
	public void editEmailSubject(String es) {
		eu.clickElement(esubject);
		eu.clearText(esubject);
		eu.enterText(esubject, es);
	}
	
	public void clickOnSave() {
		eu.scrollUntilVisiability(save,driver);
		eu.clickElement(save);
	}


}
