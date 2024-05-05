package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		//Wait(Interface) : until(); --> FluentWait(Class): until(){} + other methods --> WebDriverWait (Class)

				WebDriver driver = new ChromeDriver();//browser - chrome

				driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
				
				By image = By.cssSelector("div#imageTemplateContainer img");
				
				
				//FluentWait:
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)//child class object referred by parent interface ref variable
				                            .withTimeout(Duration.ofSeconds(10))//if u find this image within 10secs
				                            .pollingEvery(Duration.ofSeconds(2))//then check every 2secs
				                            .ignoring(NoSuchElementException.class)//plz ignore those such exp upto 10secs
				                            .ignoring(ElementNotInteractableException.class)//we can add multiple ignore exp class
				                            .withMessage("time out ...element is not present...");//still element is not there then u've to print ur custom msg
				
				WebElement img_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
				   
				img_ele.click();
				
				
				//Wait mechanism for alerts:
				Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoAlertPresentException.class)
                        .withMessage("time out ...alert is not present...");
				
				
				//WebDriverWait with FluentWait Features:
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//WebDriverWait is child of FluentWait
//				wait.pollingEvery(Duration.ofSeconds(2))
//				    .ignoring(NoSuchElementException.class)
//				    .withMessage("time out ...element is not present...");
//				
//				WebElement img_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
//				   
//				img_ele.click();

	}

}
