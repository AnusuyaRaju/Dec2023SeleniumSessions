package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		//browser : JS
		//JS --> JavaScriptExecutor --> executeScript()
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://app.hubspot.com/login");
				
				//we've to convert the driver into JavaScriptExecutor and store it in JavaScriptExecutor ref variable
				//both JavascriptExecutor n driver r interface here 1 interface casted into another interface
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				
				
				//1. 2 ways to get title of the page in Selenium 1..getTitle() another one is below 
				//document.title; syntax for JavascriptExecutor in DOM we can check inside console tab it will give the title 
//				String title = js.executeScript("return document.title;").toString();
//				System.out.println(title);
//				
//				String url = js.executeScript("return document.URL;").toString();
//				System.out.println(url);
				
				
				//Here we r using JvaScriptUtil methods:
				JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
				String title = jsUtil.getTitleByJS();
				System.out.println(title);//get the title of page
				
				//2. Some javaScript syntax: better we can go with selenium options - driver.navigate().refresh() same for forward m=n backward
				//history.go(0); refresh the page
				//history.go(1); next page forward
				//history.go(-1); previous page backward
				
				
				//3. javaScriptAlerts:
				//jsUtil.generateAlert("hi this is my alert");//simple alert
				
//				String pageText = jsUtil.getPageInnerText();//it will print entire text of the page
//				System.out.println(pageText);
//				if(pageText.contains("Deal Pipeline")) {
//					System.out.println("PASS");
//				}
				
				
				//4. To stop the scrolling once you find the expected specific element n this is for page scrolling
//				WebElement header = driver.findElement(By.xpath("//h3[text()='Companies & Contacts']"));
//				jsUtil.scrollIntoView(header);
				
				
				//5. Zoom in/zoom out:
//				jsUtil.zoomChromeEdgeSafari("50");
//				//Thread.sleep(500);
//				jsUtil.zoomChromeEdgeSafari("400");
				
				
				//6. DrawBoarder: it will draw boarder for given web element
				
			//  jsUtil.drawBorder(header);
				//WebElement loginForm = driver.findElement(By.cssSelector("form#hs-login"));
				//jsUtil.drawBorder(loginForm);
				
				
				//7. Want to flash/highlight the given web element:
				//WebElement loginForm = driver.findElement(By.cssSelector("form#hs-login"));//Entire form
				WebElement userId = driver.findElement(By.id("username"));//specific element only
				WebElement pwd = driver.findElement(By.id("password"));//specific element only
				
//				jsUtil.flash(loginForm);
				jsUtil.flash(userId);
				userId.sendKeys("anu@gmail.com");
				jsUtil.flash(pwd);
				pwd.sendKeys("anu@123");
				
				
				//8. Click method in JS
				WebElement loginBtn = driver.findElement(By.id("loginBtn"));
				jsUtil.clickElementByJS(loginBtn);
				
				
				//IQ:
				//9.SendKeys in JS: we should avoid sendKeys in JS bcus we can send values only for id thru findElementById there is no other attributes very limited options r available
				//for findElements we have findElementsName,tagName,Classname r available
				//Actions.click() - 1st choice, normal click()-2nd choice, JS sendKeys - 3rd choice
				
				
				
	}

}
