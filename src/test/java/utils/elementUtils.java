package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementUtils {
	
	WebDriver edriver;
	
	public elementUtils(WebDriver driver) {
		this.edriver = driver;
	}

	public void clickElement(WebElement ele) {
		
		ele.click();
	}
	
	public void enterText(WebElement et,String sk) {
		et.sendKeys(sk);
	}

}
