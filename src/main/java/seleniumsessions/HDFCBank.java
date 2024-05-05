package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCBank {

	public static void main(String[] args) throws InterruptedException {
        
		
		//For testing: xpath
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.ultimatix.net/utxLogin/");

		WebElement userName = driver.findElement(By.id("form1"));
		userName.click();
		userName.sendKeys("2467357");
		driver.findElement(By.id("proceed-button")).click();
	

		//Thread.sleep(3000);


		

	}

}
