package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIfFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://selectorshub.com/iframe-scenario/");//Page
		
		Thread.sleep(3000);
		
		//IQ: what do u meant by NestedIfFrames..?
		//in i-frame we should go step by step can't jump directly from i-frame 1 to i-frame 3
		//frame 1 to frame 2 to frame 3 via driver.switch().frame("")
		//can't go from f3 to f2, f2 to f2 it should go via parentFrame()
		
		//this element inside i-frame - "pact1"
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		//this element inside another i-frame - "pact2" i-frame - "pact1"
		driver.switchTo().frame("pact2");//f2
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		//this element inside another i-frame - "pact"3 i-frame - "pact2"  i-frame - "pact1"
		driver.switchTo().frame("pact3");//f3
		driver.findElement(By.id("glaf")).sendKeys("1M subs");
		
		//driver.switchTo().defaultContent();//it always go to main page
		//quick check on main page:
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		
		//f3 --> f2 using switch().frame()? : NOOOOOO
		//f3  ---> parentFrame() : f2 : YESSSS
		//f2 --> parentFrame(): f1 : YESSS
		
		
		
		driver.switchTo().frame("pact2");//f3 to f2
		driver.switchTo().frame("pact1");//f2 to f1
		driver.findElement(By.id("inp_val")).sendKeys(" is fun");
		
	
		//Selenium 4.x:
//		driver.switchTo().parentFrame();//go to f2 frame
//		driver.findElement(By.id("jex")).sendKeys(" with fun");
//		
//		driver.switchTo().parentFrame();//go to f1 frame
//		driver.findElement(By.id("inp_val")).sendKeys(" is boring");
//		
//		//driver.switchTo().parentFrame();//go to main page
//		//driver.switchTo().defaultContent();//go to main page
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		

	}

}
