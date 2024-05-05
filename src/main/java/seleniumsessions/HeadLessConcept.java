package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		//headless Vs headed
		//headless means: no bowser visibility
		//faster
		//run test cases on CI CD/Jenkins/Linux: headless
		//recommended: not recommended
		//if I run headless mode in my local machine testing is happening behind the screen n there is no disturbance
		//problems: 1. It's not an actual user stimulation
		//2. complex apps/HTML DOM: heavily written with so many components r there it might not work with headless
		//alerts/popup's: could be a problem
		
//		ChromeOptions co = new ChromeOptions();//ChromeOptions class is the responsible for headless n argument name is --headless already predefined
//		co.addArguments("--headless");
//		co.addArguments("--incognito"); // chrome, firefox
//		WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		//eo.addArguments("--inprivate");//edge incognito
		WebDriver driver = new EdgeDriver(eo);
		
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		//driver.quit();
		
		//Headless options: No need to go with these options bcus we've to use above ChromeOptions,FirefoxOptions,EdgeOptions
		//ghostdriver
		//phantomJS
		//htmlunitdriver - this is not part of selenium got separated
		
		//aws -- ec2 linux -- black box -- headlesss -- docker(LINUX) -- UI

		
		

	}

}
