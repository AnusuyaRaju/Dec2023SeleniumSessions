package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendkeys {

		static WebDriver driver;

		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//			driver.findElement(By.id("pass")).click();//No exp
//			driver.findElement(By.id("pass")).sendKeys("testing");//ElementNotInteractableException: element not interactable
			//driver.findElement(By.id("fname")).sendKeys(null);//IllegalArgumentException: Keys to send should be a not null CharSequence

			
			//IQ: In selenium sendKeys() what kind of parameter it's taking..? 
			//Actually it taking Character sequence it's an interface it should take 3 types of data it can take string,string buffer & string builder we can supply individually also & comma separator also bcus these 3 .(dot)parameters is representing array parameter
			StringBuilder sb = new StringBuilder("testing");
			String s = "automation";
			driver.findElement(By.id("fname")).sendKeys(sb, s, "naveen");//testingautomationnaveen
			
	}

}
