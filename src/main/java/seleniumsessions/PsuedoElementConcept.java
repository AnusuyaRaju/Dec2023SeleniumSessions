package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

	public static void main(String[] args) {
		
		//Psuedo is the part of HTML DOM these r not having anyother property like id,name ... etc nothing is visible simply showing like below,
		//::before
		//::after
		//how to use cssSelector in JS: querySelector
		//Psuedo is mandatory fields if yes they should marked with * symbol so we can capture it by using JS querySelector
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content');";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String madatory_text = js.executeScript(script).toString();
		System.out.println(madatory_text);
		
		//quick sanity check whether developer added * symbol or not..?
		if(madatory_text.contains("*")) {
			System.out.println("FN is a mandatory field");
		}
		

	}

}
