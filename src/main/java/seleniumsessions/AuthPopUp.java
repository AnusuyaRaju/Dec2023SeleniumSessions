package seleniumsessions;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Basic auth:
		String username = "admin";
		String password = "admin";

		//driver.get("https://the-internet.herokuapp.com/basic_auth");//getting authentication popup 
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//after https:// added admin:admin@ to fill out the popup by browser internally
		//If ur pwd is having admin@123 then it won't work
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");//use this method also here we used variable names
		
		
		
		//sel 4.x: Recently they've added with new UsernameAndPassword
		//if ur pwd has any spl char it will work
		//HasAuthentication: any popup coming from chrome n edge browser then we can use HasAuthentication
		
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));//-> is called lamda ()-> supplier
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	}

}
