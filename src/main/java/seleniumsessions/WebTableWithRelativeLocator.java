package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class WebTableWithRelativeLocator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		
		//1. click the check box which is on left side of Joe.Root:
		WebElement playerEle = driver.findElement(By.linkText("Joe.Root"));
		
		driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playerEle)).click();
		
		
		//2. Try to print Joe.Root right side values only his value but it's printing all right side values better to avoid this pattern especially for this check
		List<WebElement> eleList =  driver.findElements(with(By.xpath("//table[@id='resultTable']//td")).toRightOf(playerEle));
		for(WebElement e : eleList) {
			System.out.println(e.getText());
		}
		
		

	}

}
