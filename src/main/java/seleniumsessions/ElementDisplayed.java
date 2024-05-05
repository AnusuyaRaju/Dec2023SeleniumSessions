package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//IQ: if we pass wrong classname then will get NoSuchElementException even it doesn't give false bcus not even reach to action - isDisplayed() failed at By.classname
//		boolean flag = driver.findElement(By.className("img-responsive11")).isDisplayed(); //when we check any element thru inspect cntl+F give eg: .img-responsive
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo is not displayed");
//		}
		
//		By logo = By.className("img-responsive");
//		if(isElementDisplayed(logo)){
//			System.out.println("logo - displayed");
//			
//		}
		
//		List<WebElement> logo = driver.findElements(By.className("img-responsive11"));
//		if(logo.size()==1) { // we should use this logic only when this element is unique (size is 1) if the logo size is 5 then we shouldn't use this logic 
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo is not displayed");
//		}
		
//IQ: Don't you use isDisplayed() give me some custom solution how will u check the element is displayed only once...?
//		By logo = By.className("img-responsive11");
//		if(isElementExist(logo)) {
//			System.out.println("PASS");
//		} else {
//			System.out.println("FAIL");
//		}
		
//IQ: Don't you use isDisplayed() give me some custom solution how will u check the element is displayed multiple times..?		
		By logo = By.className("img-responsive11");
		if(multipleElementsExist(logo)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		

	}
	

	public static boolean isElementExist(By locator) {
		if(getElements(locator).size()==1) {
			return true;
		}
		return false;
	}
	
	public static boolean multipleElementsExist(By locator) {
		if(getElements(locator).size()>0) {
			return true;
		}
		return false;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
