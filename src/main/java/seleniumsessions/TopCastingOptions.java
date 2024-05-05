package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.WD d = n CD();
		//Valid - recommended(More preferable)
		//want to run test on local machine
		//WebDriver driver = new ChromeDriver();
		
		//2.SC d = n CD();
		//Valid - Not recommended
		//SearchContext driver = new ChromeDriver();
		
		//3.RWD d = n CD();
		//Valid - recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//4.ChromiumDriver driver = new ChromeDriver();
		//Valid - Not recommended
		
		//5.WD d = n RWD();
		//Valid - recommended
		//whenever want to run test on the remot/server/cloud machine/grid/sauce labs/lambdatest/browsertask
		//WebDriver driver = new RemoteWebDriver(serverURL, capabilities);
		
		//6.SC d = n RWD();
		//Valid - Not recommended
		//SearchContext driver = new RemoteWebDriver(serverURL, capabilities);
		
		//7.CD d = n CD();
		//valid but works only for chrome browser
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		

	}

}
