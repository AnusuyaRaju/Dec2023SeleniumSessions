package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
//		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
//		String emailId = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(emailId);
		
//		String email = driver.findElement(By.id("input-email")).getText();
//		System.out.println(email);
		
		//getText: link,header,label,span
		//IQ: getText() shouldn't work for text fields so we've to use getAttribute() n passing value attribute over there
		
		//Assignment for fetching registration form text fields:
		driver.findElement(By.id("input-firstname")).sendKeys("Levi");
		String firstName = driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys("Sudha");
		String lastName = driver.findElement(By.id("input-lastname")).getAttribute("value");
		System.out.println(lastName);
		driver.findElement(By.id("input-email")).sendKeys("Levi@gmail.com");
		String email = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(email);
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		String mob = driver.findElement(By.id("input-telephone")).getAttribute("value");
		System.out.println(mob);
		driver.findElement(By.id("input-password")).sendKeys("Levi@123");
		String pwd = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println(pwd);
		driver.findElement(By.id("input-confirm")).sendKeys("Levi@123");
		String confirmPwd = driver.findElement(By.id("input-confirm")).getAttribute("value");
		System.out.println(confirmPwd);
		

	}

}
