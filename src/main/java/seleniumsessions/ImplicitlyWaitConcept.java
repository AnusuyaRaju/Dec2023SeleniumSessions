package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		//IQ:
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// deprecated still works in sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x 
		//imp wait: is always Global wait: It's applied to all the elements by default
		//FindElement/FindElements
		//Implicitly wait is global wait it means it's common for until we override don't u think it's major prblm every time we have to keep changing
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//Login page: 10 secs
		//total timeout = 10 secs
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("test");// e1: 10:element found within 2secs = 8secs ignored
		//e2: 10 : 3 = 7
		//e3: 10 : 8 = 2
		//e4......en: 10 secs
		
		
		//Home page: 15 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel 4.x
//		//he1: 15
//		//he2: 15
//		//logout: 15
//		
//		//login page: 
//		//e1 e2 e3: 
//		
//		//reg page: 5 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
//		
		
		//what if I don't want to apply implicit wait for specific page....?
//		//cart page: 0 : nullify of imp wait: 0 after i want to land in home page again need to override the wait secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x
		
		//login page: 0 secs
		
		
		
		//case 2: if i want to perform implicit wait only for e1 element for other elements don't want to go via implicit wait need to interact with them directly 
		//we can't ignored it for other elements bcus it's global wait
		//login page: 10 secs
		//e1 : 10
		//e2 : 10
		//e3 : 10 
		//e4 : 10
		
		
		//case 3:
		//its only for webelements
		//not applicable for non web elements: JS alert, title, urls, browser window
		
		//We should avoid imp wait in your real time framework it's a bad choice
		


	}

}
