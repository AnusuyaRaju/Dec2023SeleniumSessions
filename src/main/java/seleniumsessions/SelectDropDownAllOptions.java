package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownValues(country, "India");
		

	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		//target is that have to convert List<WebElement> to List<String>
		
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String optionText = e.getText();
			optionsTextList.add(optionText);
			
			
		}
		return optionsTextList;
		
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		return select.getOptions();
	}
	
	
	public static int getDropDownValuesCount(By locator) {
		return getDropDownOptionsList(locator).size();
		
		
	}

	public static void doSelectDropDownValues(By locator, String value) {

		// IQ: If ur not allowed to use selectByValue,selectByIndex,selectByVisibleText
		// then how will u select the values from the drop down...?
		// Another way of selecting the values from the drop down

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break; // it will break entire for each loop
			}

		}

	}
	
	public static void printSelectDropDownValue(By locator, String value) {
        List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
