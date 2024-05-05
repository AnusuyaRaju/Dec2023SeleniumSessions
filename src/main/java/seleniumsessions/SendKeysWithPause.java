package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {

         
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//IQ: In Given page there is search text box there where we need to enter macbook with pause on while entering each char 
		//It's used to get some suggestions while entering the char with pause
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.name("search"));
		
		String value = "macbook" ;
		char val[] = value.toCharArray();
		
		for(char c : val) {
			act.sendKeys(search, String.valueOf(c)).pause(500).build().perform();
			
		}
		
		

	}

}
