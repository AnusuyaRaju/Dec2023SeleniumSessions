package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(2000);
		
		//.frame(WebElement) here we're passing WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("anu");
		
		driver.switchTo().defaultContent();//driver come back to the main page from frame
		String text  = driver.findElement(By.xpath("//h3[contains(text(),'Vehicle Registration Form')]")).getText();
		System.out.println(text);
		
		
		
		//Frame index is risky bcus in future some more frames will be added

	}

}
