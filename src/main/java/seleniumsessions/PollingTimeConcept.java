package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {
		
		
		//IQ:
		//default polling time in selenium 500 ms

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent

		By twitter = By.xpath("//a[contains(@href, 'twitter11')]");

		//If u don't supply anything then interval time = 500 ms in console
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//If I want to supply my own interval time then will get interval time = 2000 ms/2 secs inm console 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2), Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(twitter)).click();
		
	
		
		
		
		
		
		
		
		

	}

}
