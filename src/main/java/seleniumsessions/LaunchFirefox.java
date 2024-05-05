package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle();//get title
		System.out.println("page title:" + title);//print title in console
		
		//Check point/Verification point/Actual vs Expected Results:
		
		if(title.equals("Google")) {
			System.out.println("Correct title -- Pass");
		}
		else {
			System.out.println("Incorrect title -- Fail");
		}
		
		//Automation steps + Verification point ---> Automation testing
		//test steps + Verification point --> Automation
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("google.com")) {
			System.out.println("url -- passed");
		}
		else {
			System.out.println("url -- failed");
		}
		
		//Close the browser: quit() & close()
		driver.close();
		

	}

}
