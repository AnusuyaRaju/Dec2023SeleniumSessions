package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.findElement(By.name("search111")).sendKeys("mackbook");
		//NoSuchElementException
		
		List<WebElement> eles = driver.findElements(By.tagName("naveen"));
		//It will always give an empty ArryList size is 0
		System.out.println(eles.size());//0
		System.out.println(eles);//[]
		
		
		

	}

}
