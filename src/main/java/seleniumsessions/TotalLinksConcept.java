package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {
		//1.Total links
		//print the text of each link
		//3.avoid blank text
		//4.broken link - later
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1.find out all the elements --> find elements
		
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		System.out.println("Total links: " + allLinks.size());
//		
//		//print the text of each link
//		for(int i=0;i<allLinks.size();i++) {
//			String text = allLinks.get(i).getText();
//			if(text.length()!=0) {
//			System.out.println(text);
//			}
//		}
		
//		System.out.println("------------");
//		for(WebElement e : allLinks) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
//		
//		//total text fields on the page
//		List<WebElement> allTextFields = driver.findElements(By.className("form-control"));
//		System.out.println(allTextFields.size());
		
//		for(WebElement e : allTextFields) {
//			e.sendKeys("testing");
//		}
		
		//Print specific links of the text on the register page - Assignment
		
		List<WebElement> links = driver.findElements(By.className("list-group-item"));

        // Print the text of the links
        for (WebElement link : links) {
            String linkText = link.getText();
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
            }
        }
		
		
		
		

	}

}
