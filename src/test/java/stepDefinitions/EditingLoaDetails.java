package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.EditLoaDetails;

public class EditingLoaDetails {
	
	DriverFactory df = new DriverFactory();
	
	WebDriver driver;
	EditLoaDetails ed;
	
/*	@Then("Click on the LOA Creator role")
	public void click_on_the_loa_creator_role() throws InterruptedException {
		driver =df.getDriver();
		ed = new EditLoaDetails(driver);
		ed.clickLoaSideMenu();
	}
	
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
	} */

}
