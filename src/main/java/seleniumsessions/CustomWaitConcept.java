package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {

	static WebDriver driver;
	
	public static WebElement retryingElement(By locator, int timeOut) {
		
		WebElement element = null;
		int attempts = 0;
		
		//while loop for we're not sure on how many times it's going to be happen
		while(attempts<timeOut) {
			try {
			element = driver.findElement(locator);
			System.out.println("element is found....." + locator + " in attempts " + attempts);
			break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + " in attempts " + attempts);
				try {
					Thread.sleep(500);//this is generic method to pause it also we haven't used in main use case n this is classic eg of Thread.sleep
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		
		if(element == null) {
			System.out.println("element is not found.... tried for" + timeOut + " times " + " with the interval of " + 500 + " milliseconds...");
			throw new EleException("No Such Element");
		}
		return element;
		
	}
	
	
public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		
		WebElement element = null;
		int attempts = 0;
		
		//while loop for we're not sure on how many times it's going to be happen
		while(attempts<timeOut) {
			try {
			element = driver.findElement(locator);
			System.out.println("element is found....." + locator + " in attempts " + attempts);
			break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + " in attempts " + attempts);
				try {
					Thread.sleep(intervalTime*1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		
		if(element == null) {
			System.out.println("element is not found.... tried for" + timeOut + " times " + " with the interval of " + intervalTime + " seconds...");
			throw new EleException("No Such Element");
		}
		return element;
		
	}
	
	
	public static void main(String[] args) {
		
		//Thread.sleep - static wait - dynamic wait
		
		//IQ: explain CustomWaitConcept................?
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email11");
		retryingElement(emailId, 10, 1).sendKeys("japan@gmail.com");
		
		
		//if ExplicitWait or fluentWait not working properly then we can use CustomWait which has been added inside ElementUtil 
		
		

	}

}
