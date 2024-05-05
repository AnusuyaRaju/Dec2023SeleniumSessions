package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//SVG: Scaler Vector Graph - here normal xpath will not work what we can use is for SVG xpath: //*[local-name()='svg'] 
		//it's mandatory it will give all svg elements where we have to filter out with other attributes
		
		driver.findElement(By.name("q")).sendKeys("macbook");
		driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();
		
		

	}

}
