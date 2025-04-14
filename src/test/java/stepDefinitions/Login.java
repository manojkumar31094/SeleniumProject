package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;

public class Login {
	
	DriverFactory df = new DriverFactory();
	WebDriver driver;
	
	@Given("Enter the application url {string}")
	public void enter_the_application_url(String url) {
	   
		driver = df.getDriver();
		driver.get("https://mvnrepository.com/");
		
	}
}
