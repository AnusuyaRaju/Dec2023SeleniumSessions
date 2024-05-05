package seleniumAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//here we r going to launch 4 child windows one by one then close all child windows except parent
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(3000);
		
		//<a target="_blank" it means it will open in a new window this is a keyword
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child window open
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		//1st: fetch the window id's:
		
		//List is order based like 0, 1, 2 etc... but set is non order based collection it can't have duplicate values that's the reason behind here
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();//initially iterator pointing to jus above(999) the set object(eg:1000) 
		
		String parentWindowId = it.next();
		System.out.println("parent window id : " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id : " + childWindowId);
		
		
		//2nd.Switching work:
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());//twitter url
		
		driver.close();//close the child window bcus driver is lost after closing the child window
		
		driver.switchTo().window(parentWindowId);//come back to parent window
		System.out.println("parent window url : " + driver.getCurrentUrl());//orangehrm url
		
		driver.quit();

	}

}
