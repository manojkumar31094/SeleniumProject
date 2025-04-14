package practiseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online2.devsingaporepools.com/en/lottery/4d-self-pick");
		//driver.findElement(By.linkText("Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("LabeledTextField_username")).sendKeys("devpreprod1");
		driver.findElement(By.id("LabeledTextField_login-password-id")).sendKeys("$Testing123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

	}

}
