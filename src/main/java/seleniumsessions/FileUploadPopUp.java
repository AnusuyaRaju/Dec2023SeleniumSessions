package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//type = file is mandatory when u inspect that element then only handle it 99.9% it should be there
		
		//inside SendKeys we've to pass the path \"C:\\Users\\divya\\OneDrive\\Documents\\personal.txt\"
		
		driver.findElement(By.name("upfile")).sendKeys("\"C:\\Users\\divya\\OneDrive\\Documents\\personal.txt\"");
		//type = file is not available then we should ask developer to add this attribute so that we can handle this scenario otherwise selenium not support

		
		//sikuli - image based/resolution based
		//autoIT -- only for windows machine -- wont work in docker, headless, jenkins, linux, macos
		
		
	}

}
