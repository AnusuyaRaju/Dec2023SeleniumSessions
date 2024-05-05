package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		// IQ: ur not allowed to use select class & select values from Drop Down..?
		
		//By options = By.xpath("//select[@id='Form_getForm_Country']/option");//Used relative xpath 
		
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		doSelectValuesFromDropDown(options, "India");
		doSelectValuesFromDropDown(options, "Australia");
		
		

	}
	
	public static void doSelectValuesFromDropDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator); //shortcut for assigning local variable cntl+2 then it will popup List<> at bottom right corner common for all methods
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}
