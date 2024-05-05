package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		//IQ: wt r diff JS alerts are available...?
		//1.alert
		//2.prompt
		//3.confirm
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. alert: simple alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();//click ok 
		
		//alert.dismiss();//cancel alert
		
		//2. confirm: Asking confirmation like are u sure u want to delete this user ...? ok or cancel
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();//click ok
		
		//3. prompt: Asking something from my side enter ur user id, name or something.....
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(5000);
		alert.sendKeys("naveen");		
		alert.accept();//click ok
		
		
		
		

	}

}
