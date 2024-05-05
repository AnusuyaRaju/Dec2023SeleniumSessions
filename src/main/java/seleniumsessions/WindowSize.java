package seleniumsessions;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();//good to use
		//driver.manage().window().fullscreen();// this is also maximize but the current window if it's not already maximized
		
		
		//responsive - view port:
//		Dimension dim = new Dimension(414, 896);
//		driver.manage().window().setSize(dim);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//sel 4.x Window maximize n minimize:
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
		
		//checking fname text box height n width
		WebElement fn = driver.findElement(By.id("input-firstname"));
		System.out.println(fn.getCssValue("font-size"));
		int ht = fn.getSize().height;
		int wd = fn.getSize().width;
		System.out.println(ht);
		System.out.println(wd);
		
		
		//getLocation 
		int x = fn.getLocation().getX();
		int y = fn.getLocation().getY();
		System.out.println(x + " " + y);
		
		
		//checking back ground color code for continue button on registration page
		WebElement continue_btn = driver.findElement(By.xpath("//input[@value='Continue']"));
		String bk_color = continue_btn.getCssValue("background-color");
		System.out.println(bk_color);
		
		


	}

}
