package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//IQ: yes i can wait for title n url is this possible in selenium explicit wait..?
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		// System.out.println(driver.getTitle()); //we shouldn't get immediate title follow below steps n get it
		
		
//		String title = waitForTitleContains("Free CRM software for customer relationship management", 5);
//		String titleIs = waitForTitle(title, 5);
//		System.out.println(title);
//		System.out.println(titleIs);
		
//		driver.findElement(By.linkText("Sign Up")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.urlContains("register"));
//		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://classic.freecrm.com/register/"));
		System.out.println(driver.getCurrentUrl());

		
		
		
	}
	
	//If we have a long URL then we can pass urlFraction n used urlContains:
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		} catch (Exception e) {
			System.out.println("URL fraction is not found within : " + timeOut);
		}
		return null;	
		
	}
	
	//If we give an exact URL then we can pass full url n used urlToBe:
	public static String waitForURLIs(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		}
		} catch (Exception e) {
			System.out.println("URL is not found within : " + timeOut);
		}
		return null;	
		
	}
	
	//If we have a long title then we can pass titleFraction n used titleContains:
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		} catch (Exception e) {
			System.out.println("title is not found within : " + timeOut);
		}
		return null;	
		
	}
	
	//If we give an exact title then we can pass title alone n used titleIs:
	public static String waitForTitle(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		} catch (Exception e) {
			System.out.println("title is not found within : " + timeOut);
		}
		return null;	
		
	}

}
