package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class MyHooks {
	
	DriverFactory df = new DriverFactory();
	WebDriver driver;
	
	@Before
	public void setup() throws IOException {
		
		Properties prop = ConfigReader.intializeProperties();
		
		df.initializeBrowser(prop.getProperty("browser"));
		driver =df.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
	}
	
/*	@After
	public void tearDown() {
		
		driver.close();
	}  */

}
