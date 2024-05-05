package seleniumsessions;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {
	
	

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("chrome");
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By email = By.name("email");
		By phone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		By isSybscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSybscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By policyChkBox = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By successMsg = By.tagName("h1");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fn, "isha");
		eleUtil.doSendKeys(ln, "levi");
		eleUtil.doSendKeys(email, StringUtils.getRandomEmail());
		eleUtil.doSendKeys(phone, "0102030405");
		eleUtil.doSendKeys(pwd, "isha@123");
		eleUtil.doSendKeys(confirmPwd, "isha@123");
		eleUtil.doClick(isSybscribeYes);
		eleUtil.doClick(policyChkBox);
		eleUtil.doClick(continueBtn);
		String actSuccMsg = eleUtil.dogetElementtext(successMsg);
		System.out.println(actSuccMsg);
		if(actSuccMsg.equals("Your Account Has Been Created!")) {
			System.out.println("User reg -- passed");
		}else {
			System.out.println("user reg -- failed");
		}
		//brutil.quitBrowser();
	
		
		
		
		
		

	}

}
