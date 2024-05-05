package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//open browser: session id 123
		driver.get("https://www.google.com");//enter url: 123
		String title = driver.getTitle();//get title: 123
		System.out.println("page title:" + title);//print title in console
		
		
		
		String url = driver.getCurrentUrl();//123
		System.out.println(url);
		
		//driver.close();//browser is closed session id is 123 invalid
		//After browser got closed session is invalid with the same id: NoSuchSessionException: invalid session id
		
		
		driver.quit();//browser is closed session id is null
		//After browser got quit, we'll get session ID is null. Using WebDriver after calling quit()..?
		
		
		driver = new ChromeDriver();//open browser: new session id: 456
		driver.get("https://www.google.com");//enter url: 456
		
		System.out.println(driver.getTitle());//456
		
		

	}

}
