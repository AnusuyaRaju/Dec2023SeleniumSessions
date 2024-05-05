package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {
		
		//IQ: Shadow Root is container in a web page developer has used it's a light weight n more secured coming inside shadow root is very difficult
		//Limitation: Shadow Root should be in open state if it's not open state we shouldn't automate
		//If web element inside shadow root then we should use JS executor
		
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
		Thread.sleep(3000);
		
		//jus right clk the web ele copy the JS path n paste it
		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement search = (WebElement)js.executeScript(search_script);
		search.sendKeys("notifications");
		
		
		
		

	}

}
