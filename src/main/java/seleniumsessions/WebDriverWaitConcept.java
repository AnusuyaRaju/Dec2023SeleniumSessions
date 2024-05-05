package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Wait(Interface) : until(); --> FluentWait(Class): (@overridden)until(){} + other methods --> WebDriverWait (Class): no methods no overridden nothing
		//WebDriverWait is a child of FluentWait and it's a dynamic wait.
		
				driver = new ChromeDriver();
				//don't mix implicit & explicit waits together
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
				driver.get("https://www.orangehrm.com/30-day-free-trial/");
				//I don't want to apply Thread.sleep() n implicit wait go with Explicit wait either FluentWait() or WebDriverWait()
				
				
				By fullName = By.id("Form_getForm_Name");
				By email = By.id("Form_getForm_Email");
//				waitForElementPresence(fullName, 10).sendKeys("anu");
//				getElement(email).sendKeys("anu@gmail.com");//no wait for this element
				waitForElementVisible(fullName, 10).sendKeys("testing");
				
				
				//e1: 10 secs. if we pass incorrect web element it shouldn't throw the exp wait for 10secs n then it will throw 2 exps
				//TimeOutexp n NoSuchElementExp
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				WebElement fullName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//				fullName_ele.sendKeys("testing");
//				
//				//e2: 0 sec
//				driver.findElement(By.id("Form_getForm_Email")).sendKeys("testing@gmail.com");
				
				
	}
	
	      //IQ: diff b/w presenceOfElementLocated & visibilityOfElementLocated either both r same..?
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/**
     * An expectation for checking that an element is present on the DOM of a page and visible.
     * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
     * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	//when u don't want to apply any wait then i'll be calling normal getElement() whenever i want to apply wait then call this method waitForElementVisible

}
