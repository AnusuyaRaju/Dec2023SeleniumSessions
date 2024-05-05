package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//IQ:
		//Due to web element id got expired that's y we got StaleElementReferenceException there r 2 ways to fix 1 is re-initializing the web element
		//2nd one is create WebDriverWait with fluentWait properties

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//V1 DOM
        
		
		//1st way: Re initialization of web element:
		WebElement emailId = driver.findElement(By.id("input-email"));//element got created from V1 DOM
		emailId.sendKeys("sasi@gmail.com");//performing action on V1 DOM
		
		//Not only refresh if we perform back & forward also getting same exp
		driver.navigate().refresh();//after refreshing page next version available is V2
		
		//element got created from V2 DOM
		//emailId = driver.findElement(By.id("input-email"));//We should re-inialize the web element so that avoid StaleElementReferenceException
		//performing action on V2 DOM
		emailId.sendKeys("tomil@gmail.com");//selenium.StaleElementReferenceException: stale element reference: stale element not found
		
		
		//IQ: How exactly selenium will get to know how to maintaining these things...?
		//stale element not found in latest DOM in current DOM after refreshing it that's y got exp actual reason is webelement id got expired
		
		
		//2nd way: apply WebDriverWait with fluentWait properties
        //After refreshing the page not interested to create the webelement again Can we apply WebDriverWait with fluentWait properties....?
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(500)).ignoring(StaleElementReferenceException.class)
		           .withMessage("element not found...");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email\"))).sendKeys(\"tom@gmail.com")));
		                              
		
	}
	
	

}
