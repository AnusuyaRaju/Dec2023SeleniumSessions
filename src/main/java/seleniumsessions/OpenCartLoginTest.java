package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");//123
		//brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "shweta@gmail.com");
//		eleUtil.doSendKeys(pwd, "shweta@123");
		
		eleUtil.doSendKeys(firstName, "Anu");
		eleUtil.doSendKeys(lastName, "Raju");
		eleUtil.doSendKeys(email, "anu@gmail.com");
		eleUtil.doSendKeys(phone, "9090878797");
		eleUtil.doSendKeys(pwd, "anu@123");
		eleUtil.doSendKeys(confirmPwd, "anu@123");
		
		//brUtil.closeBrowser();
		

	}

}
