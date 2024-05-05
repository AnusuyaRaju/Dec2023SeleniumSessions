package seleniumsessions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//1. in login page want to print above the label jus above username text field 
//		WebElement ele =  driver.findElement(By.id("input-email"));
//		
//		String label = driver.findElement(with(By.xpath("//label[contains(text(),'E-Mail Address')]")).above(ele)).getText();
//		System.out.println(label);
//		
//		
//		//2. how to print the paragraph below New customer n above Continue button
//		WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
//		WebElement continueButton = driver.findElement(By.linkText("Continue"));
//		WebElement returningCus = driver.findElement(By.xpath("//strong[text()='I am a returning customer']"));
//		
//		List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(continueButton).toLeftOf(returningCus));
//		
//		for(WebElement e : paraList) {
//			System.out.println(e.getText());
//		}
		
		
		
		//3. In registration page how to check privacy policy is left side of check box..?
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement checkBox =  driver.findElement(By.name("agree"));
//		
//		String privacyPolicy =  driver.findElement(with(By.xpath("//b[text()='Privacy Policy']")).toLeftOf(checkBox)).getText();
//		System.out.println(privacyPolicy);
		
		//we can use above or below ways
		
		WebElement pp =  driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
		
		driver.findElement(with(By.name("agree")).toRightOf(pp)).click();
		
		
		
		
		
		

	}

}
