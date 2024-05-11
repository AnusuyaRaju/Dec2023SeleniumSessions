package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendkeys {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		
		
		
		
		//action.click() is super powerful bcus when on webpage sometimes popups r coming like accept cookiess or not(here it's overlapping) at that time 
		  //selenium unable to find the elements normal .click() & Sendkeys() won't work thats y we use action.click() & SendKeys()
		    //action.click() is also not working then we move to JavaScriptExecutor() will see later
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(username), "jass@gmail.com").perform();
//		act.sendKeys(driver.findElement(pwd), "jass@123").perform();
//		act.click(driver.findElement(login)).perform();
		
		
		doActionsSendKeys(username, "div@gmail.com");
		doActionsSendKeys(pwd, "div@123");
		doActionsClick(login);
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

}
