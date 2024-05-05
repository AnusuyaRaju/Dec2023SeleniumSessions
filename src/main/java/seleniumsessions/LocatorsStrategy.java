package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Create/find a webelement + perform action on it(click, sendKeys, getText, isDisplayed)
		
		//1.id: Unique attribute - can't be duplicate - 1st preference
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.name: Can be duplicate - 2nd preference
		
//		driver.findElement(By.name("firstname")).sendKeys("test");
//		driver.findElement(By.name("lastname")).sendKeys("automation");
		
		//By locators:
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "automation");
		
		//String locators:
//		String fn = "firstname";
//		String ln = "lastname";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("name", fn, "test");
//		eleUtil.doSendKeys("name", ln, "automation");
		
		//3.class name: It's not a unique attribute can be duplicate. if there is single web element then we can go with this - 3rd preference
		//selenium will always go n enter this value in first element
		
		//driver.findElement(By.className("form-control")).sendKeys("testing");
//*******************		
		//4.xpath: it's not an attribute - address of the specific web element inside the entire html DOM.
		//XML PATH
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
		
		//By locators:
//		By fn = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln = By.xpath("//*[@id=\"input-lastname\"]");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "testing");
//		eleUtil.doSendKeys(ln, "automation");
		
		//String locators:
//		String fn = "//*[@id=\"input-firstname\"]";
//		String ln = "//*[@id=\"input-lastname\"]";
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("xpath", fn, "testing");
//		eleUtil.doSendKeys("xpath", ln, "automation");
		
		//5.CSS: Cascaded Style Sheet - it's not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("tesing");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
		
		//6.linkText: only for links: for text of the links
		//html DOM: <a> means anchor tag
		//driver.findElement(By.linkText("Login")).click();
		
		//By locators:
//		By loginLink = By.linkText("Login");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doClick(loginLink);
		
		//7.partialLinktext: only for the links: for the partial text of the link - make sure to find a unique one
		//forgotten username
		//forgotten pwd then it's risk to find this so we can go with linkText for these cases
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagName:html tag
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
		By pageHeader = By.tagName("h1");
		ElementUtil eleUtil = new ElementUtil(driver);
		String header = eleUtil.dogetElementtext(pageHeader);
		System.out.println(header);
		
		
		
		
		
		
		

	}

}
