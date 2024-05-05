package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequences {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//1.IQ:
		//In registration page u have to fill the details from fname to till confirm pwd with Tab action:
		Actions act = new Actions(driver);
		
//		WebElement search = driver.findElement(By.name("firstname"));
//		act.sendKeys(search, "ramya")
//		.sendKeys(Keys.TAB)
//		.pause(200)
//		.sendKeys("automation")
//		.sendKeys(Keys.TAB)
//		.pause(200)
//		.sendKeys("ramy@gmail.com")
//		.sendKeys(Keys.TAB)
//		.pause(200)
//		.sendKeys("99442314232")
//		.sendKeys(Keys.TAB)
//		.pause(200)
//		.sendKeys("ramy@123")
//		.sendKeys(Keys.TAB)
//		.pause(200)
//		.sendKeys("ramy@123")
//		.build()
//		.perform();
		
		
		//2.IQ:
		//In Amazon page in search text box want to enter macbook pro by using TAB action means without direct clk n search 
		//if we type 5 times TAB then it will go to search where we pass macbook pro n add .sendKeys(Keys.ENTER) to perform
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("macbook pro")
		 .sendKeys(Keys.ENTER)
		   .build().perform();
		

	}

}
