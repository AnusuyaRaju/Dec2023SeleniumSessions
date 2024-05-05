package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		//print the states of all the countries present in this page: 
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");

		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		//when capturing svg elements starts with //*[local-name()='svg' and add svg child elements as //*[name()='g' with some other filters
		String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";
		// CSS: svg#map-svg g#regions g.region
		//CSS:tagname#id tagname#id tagname.classname
		
		
		List<WebElement> statesList = driver.findElements(By.xpath(xpath));
		System.out.println(statesList.size());
		
		Actions act = new Actions(driver);
		
		for(WebElement e : statesList) {
			act.moveToElement(e).perform();
			String stateId = e.getAttribute("id");
			System.out.println(stateId);
			Thread.sleep(500);
			
			
		}
		
	}

}
