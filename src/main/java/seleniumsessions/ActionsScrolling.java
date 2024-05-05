package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		
		//sel 4.x:
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions act = new Actions(driver);
		
		//1.Just scroll down to the page n up to the page:
		//Keys is predefined Enum in java. Enum is collection of multiple constant values
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
		
		//act.sendKeys(Keys.PAGE_UP).perform();
		
		//2.To perform keyboard actions: scroll down to the page n up again down
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		//3.Scrolldown to the page n click on specific element:
		act.scrollToElement(driver.findElement(By.linkText("Delivery Information")))
		.click(driver.findElement(By.linkText("Delivery Information"))).build().perform();
		
		
		
		

	}

}
