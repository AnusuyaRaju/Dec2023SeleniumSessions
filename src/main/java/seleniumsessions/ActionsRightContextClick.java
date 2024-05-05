package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickEle).perform();
		
		//If u want to capture only one right click menu
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		
		//If u want to capture all the right click menu items which is available then use below
		
//		List<WebElement> reightEles = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(.context-menu-separator)"));
//		for(WebElement e : reightEles) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}

	}

}
