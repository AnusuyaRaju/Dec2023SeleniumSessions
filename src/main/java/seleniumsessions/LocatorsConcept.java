package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//chrome dev tools
		//DOM: HTML: Document object Model it's coming from server
		
		//Create/find a webelement + perform action on it(click, sendKeys, getText, isDisplayed)
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		//3.By Locator: 
//		By username = By.id("input-email");//By class it's not hitting the server we can write n no of times
//		By pwd = By.id("input-password");
//		
//		WebElement email = driver.findElement(username);//driver method will hit the server
//		WebElement passsword = driver.findElement(pwd);
//		
//		email.sendKeys("test@gmail.com");
//		passsword.sendKeys("test@123");
		
		//4.By locator with some utility:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		WebElement emailId = getElement(username);
//		WebElement password = getElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		//5.By locator with element util and action util: here we r using only one driver method & doSendKeys method
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(username, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
		
		//6.By locator & create a common utility class for elements:
		//page By locators: or Object Repository
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
		
		//7.BrowserUtil + ElementUtil
		
		//8.ByUtil + String locators - problem is strings r immutable lots of string r stored in String constant pool that could be a memory isssue
		
		String username_id = "input-email";
		String pwd_id = "input-password";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys("id", username_id, "sanu@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "sanu@123");
		
//		string --> by --> webelement -- action -- 2nd
//		by -- webelement --action -- Ist
//		webelement -- action -- 3rd
		
		
		
	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//		
//	}

}
