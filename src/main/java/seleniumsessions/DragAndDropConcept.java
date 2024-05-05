package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//ele to ele on the page -- valid
		//file on the page -- NA
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		//If we have multiple actions then we use .click & .build(). without build() also it will work but without perform() it won't work
		//Diff b/w Action & Actions...?
		//Action is class we've to create obj to perform various actions and action is another interface who is writtening the action build method writtening the action 
		//Use case: is simple we can use when it needed i do it later whenever required jus use action.perform() for drag & drop.
		
		Action action = act.clickAndHold(srcEle).moveToElement(targetEle).release().build();
		action.perform();
		
		
		//If only 1 action then we can use this
		//act.dragAndDrop(srcEle, targetEle).perform();
		
		
		
		

	}

}
