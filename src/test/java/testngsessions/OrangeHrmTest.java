package testngsessions;

import org.testng.Assert;

import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {

	// when we want to capture big title right clk go to view page source n get the
	// full title

	@Test(priority = 1)
	public void titleTest() {		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "title is not matched");
	}

	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial"));
	}

}
