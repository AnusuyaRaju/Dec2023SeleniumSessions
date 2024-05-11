package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		//3 use cases for WebTablePagination 
		//1.element is present on 1st page itself
		//2.element is present on some other page
		//3.element is not even present in that table then infinite loop will happen hence we add getAttribute class contains disable property with break
		
		//Multi selection:
		while(true) {
		//if element is present on 1st page itself:
		if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){
			selectMultipleCountry("India");
		}
		
		//india is not there on 1st page then i'll click next if india is there on 1st page also need to clk next hence avoid else here
		//Pagination logic: click on next link
		WebElement next = driver.findElement(By.linkText("Next"));
		
		if(next.getAttribute("class").contains("disabled")) {
			System.out.println("pagination is over....");
			break;
		}
		
		next.click();
		Thread.sleep(1000);
		
		}
		
		
		//Single selection:
//		while(true) {
//			
//			//if element is present on 1st page itself:
//			if(driver.findElements(By.xpath("//td[text()='Naveen']")).size()>0){
//				selectCountry("Naveen");
//				break;
//			}
//			else {
//				//Pagination logic: click on next link
//				WebElement next = driver.findElement(By.linkText("Next"));
//				
//				if(next.getAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over....country is not found....");
//					break;
//				}
//				
//				next.click();
//				System.out.println("moving to next page");
//				Thread.sleep(1000);
//			}
//		}
		

	}
	
	public static void selectMultipleCountry(String countryName) {
		List<WebElement> checkboxes = 
				driver.findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : checkboxes) {
			e.click();
		}
	}
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
