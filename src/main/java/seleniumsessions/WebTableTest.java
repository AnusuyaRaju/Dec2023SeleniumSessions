package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//IQ: 
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click(); // we should give title name as per UI when u find web element name in DOM(Camelcase) + UI both r in diff 
		selectContact("Manpreet Kaur");
		String cmpnyName = getCompanyName("Manpreet Kaur");
		System.out.println(cmpnyName);
		String phone = getPhoneNumber("Manpreet Kaur");
		System.out.println(phone);
		String homePhone = getHomePhone("Manpreet Kaur");
		System.out.println(homePhone);
		String mobile = getMobile("Manpreet Kaur");
		System.out.println(mobile);
		String email = getEmail("Manpreet Kaur");
		System.out.println(email);
		
		
		
	
	}
	
	//Application specific utilities that's y we've not moved to ElementUtil
	
	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
    public static String getCompanyName(String contactName) {
    	String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[@context='company']";
        return driver.findElement(By.xpath(xpath)).getText();
    
    }
    public static String getPhoneNumber(String contactName) {
    	String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::span[@context='phone']";
    	return driver.findElement(By.xpath(xpath)).getText();
		
	}
    
    public static String getHomePhone(String contactName) {
    	String xpath = "(//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::span[@context='phone'])[last()-1]";
		return driver.findElement(By.xpath(xpath)).getText();
	}
    
    public static String getMobile(String contactName) {
    	String xpath = "(//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::span[@context='phone'])[last()]";
		return driver.findElement(By.xpath(xpath)).getText();
	}
    
    public static String getEmail(String contactName) {
    	String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[text()='manpreetkaur@gmail.com']";
		return driver.findElement(By.xpath(xpath)).getText();
	}

}
