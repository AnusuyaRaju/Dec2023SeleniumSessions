package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
//	BS -- DB connection
//	BT -- create user
//	BC -- launchbrowser
	
//	BM -- login to app
//	header test
//	AM -- logout
	
//	BM -- login to app
//	title test
//	AM -- logout
	
//	BM -- login to app
//	url test
//	AM -- logout
	
//	AC -- closeBrowser
//	AT -- deleteUser
//	AS -- disconnectWithDB

	
	
	//cntrl+shit+o for adding annotations import
	
	//Before(prerequisites) -- Test(all our test cases testing) --- After(driver.close)
	//BeforeMethod will be running b4 each n every @Test annotation and it will run alphabetical order
	//AfterMethod will be running after each n every test method
	//before Annotation: which will be running b4 ur test  
	//1.
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS -- DB connection");
	}
	
	//2.
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}
	
	//3.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchbrowser");
	}
	
	//4. //7. //10.
	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}
	
	
	//Testcases testing always starts under @Test
	//8.
	@Test
	public void titltTest() {
		System.out.println("title test");
	}
	
	//5.
	@Test
	public void headerTest() {
		System.out.println("header test");
	}
	
	//11.
	@Test
	public void urlTest() {
		System.out.println("url test");
	}
	
	//after Annotation:
	//6. //9. //12.
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	//13.
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	//14.
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	//15.
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}
	
	

}
