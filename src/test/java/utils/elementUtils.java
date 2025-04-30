package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementUtils {
	
	WebDriver edriver;
	
	public elementUtils(WebDriver driver) {
		this.edriver = driver;
	}

	public void clickElement(WebElement ele) {
		ele = explicitWait(ele, 10);
		ele.click();
	}
	
	public void enterText(WebElement et, String txt) {
		//et = explicitWait(et, 10);
		et.sendKeys(txt);
	}
	
	public WebElement explicitWait(WebElement element, long duration) {
		
		WebDriverWait wait = new WebDriverWait(edriver, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	 public static void scrollToElement(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	    }
	 
	 public static void uploadFileWithRobot(String filePath) {
	        try {
	            // Copy the file path to the clipboard
	            StringSelection selection = new StringSelection(filePath);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	            // Initialize Robot
	            Robot robot = new Robot();
	            robot.setAutoDelay(500);

	            // Press CTRL+V to paste the file path
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);

	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);

	            // Press Enter
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);

	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void clearText(WebElement element) {
		 String text =element.getAttribute("value");
		 for(int r=0; r<text.length();r++) {
			 element.sendKeys(Keys.BACK_SPACE);
		 }
	 }
	 
	 public void scrollUntilVisiability(WebElement e,WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", e);
	 }
	

}
