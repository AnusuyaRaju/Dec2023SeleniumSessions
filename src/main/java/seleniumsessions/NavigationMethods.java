package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		//back and forward
		//get vs to
		//refresh
		
		//diff b/w .get() & navigate.to()..? 
		//both r sysnonyms for each other used to launch the URL on the page only the difference implementation point of view to() is overloaded get() is not 
		    //overloaded. to() is internally calling get() only both r maintaining the history both r capable enough of doing 
		      //launching the URL and doing backend forward here
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(new URL("https://www.google.com"));//for rare case we can use for creating new URL(caps) - it's class in java
		//driver.navigate().to("https://www.google.com/");//generally we use this
		
		driver.get("https://naveenautomationlabs.com/opencart/");//driver.get & driver.navigate().to both r same they r synonyms
		System.out.println(driver.getTitle());
		//driver.navigate().to("https://www.google.com/");//.to method(overloaded method) internally calling .get method 
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//Refresh the page: 3 navigation methods: Back() forward() refresh()
		driver.navigate().refresh();
		
		
		

	}

}
