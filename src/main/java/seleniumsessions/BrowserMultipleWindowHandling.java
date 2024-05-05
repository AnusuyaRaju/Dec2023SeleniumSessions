package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		//IQ: In Orangehrm page 4 child windows r there when we click it will open 4 separate  windows have to close all child windows except parent
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		String parentWindowId = driver.getWindowHandle();//This can be used to switch to this parent window at a later date 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child window open
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();//child
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();//child
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();//child
		
		
		//fetch window id's:
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println("window url : " + driver.getCurrentUrl());
			
			//here we r using if condition to avoid parent window closer
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
			
			Thread.sleep(1000);
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
		
		
		
		
		

	}

}
