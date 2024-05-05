package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	// without befor n after also test cases will be running fine
	// IQ: Diff b/w BeforeTest & BeforeMethod annotations...?
	// @BeforeTest -- @Test -- @AfterTest - if we've 100 test cases browser will
	// launch only once n execute 100 cases n close the browser. out of 100 only 3
	// test will be passed not sure where it's failed
	// for sanity test purpose we can go with BeforeTest.
	// @BeforeMethod-- @Test -- @AfterMethod - if we've 100 test cases browser will
	// launch 100 times results like launch browser-> execute test -> close browser
	// for 100 times, out of 100 99 test will pass
	// if we have more navigation methods then we prefer BeforeMethod.BeforeMethod
	// will be running b4 each n every @Test annotation and it will run alphabetical
	// order
	// AfterMethod will be running after each n every test method

	// priority is predefined variable n it's a integer variable
	
    //IQ: what if i dont want to run specific test eg: url test is running still not completed wt we have to do jus add @Test(enabled = false) or jus add @ignore then this test will not be participated
	
	
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
	}

	@Test(priority = 2)
	public void imageTest() {
		boolean flag = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		// Assert.assertEquals(flag, true);
		Assert.assertTrue(flag);
	}

	//@Ignore - to ignore it means won't be participated on run
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}

}
