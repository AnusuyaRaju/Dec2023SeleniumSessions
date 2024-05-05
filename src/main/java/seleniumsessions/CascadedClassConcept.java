package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//IQ: explain cascaded class: By.className never use compound classes it's not allowed. allow only one class name with xpath & css selector we can use
		//cascaded means when specific element is having multiple classes. every class is having our own property that's y multiple classes can be applied for a specific element 
        
		//Invalid SelectorException: Compound class names not permitted bcus By.classname should accept only one class name(we used all class names)
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen@gmail.com");
		
		//In case of By.xpath cascaded classes will work but By.className won't work
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test");
		
		//NoSuchElementExp: ur xpath is correct but still i'm unable to find that element
		//driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("test");
		
		//valid
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test");
		
		
		//valid - By.className with only one unique class name
		//If we give .login-email in search window on DOM can figure out whether it's unique or not...?
		//driver.findElement(By.className("login-email")).sendKeys("test");
		
		
		//Valid
		//Css selector where we formated like html tag name.class1.class2.class3
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test");
		
		
		//valid css selector with one class
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("test");
		
		
		//valid css selector with any combination of class name like c1,c4 c1,c6 any sequence...
		//driver.findElement(By.cssSelector("input.form-control.private-form__control")).sendKeys("test");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"));
		
		
		//valid:
		//driver.findElement(By.cssSelector("input[class='form-control private-form__control login-email']"));
				
				
		//InvalidSelectorException: Ur xpath format is wrong, using compound classes,wrong css selector then will get this exp
		//driver.findElement(By.xpath("//input[@#@#@id=-12'username']")).sendKeys("testing@gmail.com");
		
		
		
		
		
	}

}
