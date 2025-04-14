package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	DriverFactory df = new DriverFactory();
	WebDriver driver;
	
	@Before
	public void setup() {
		
		df.initializeBrowser("chrome");
		driver =df.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://mvnrepository.com/");
	}
	
/*	@After
	public void tearDown() {
		
		driver.close();
	}  */

}
