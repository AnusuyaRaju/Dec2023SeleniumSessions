package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		selectFutureDate("August 2024", "35");
		//selectPreviousDate("January 2024", "1");
		
		//selectDate("January 2024", "1", "prev");

	}
	
	//Single method where we can pass both next n prev:
	public static void selectDate(String expectedMonthYear, String date, String type) {
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//May 2024
		
		while(!actMonthYear.equalsIgnoreCase(expectedMonthYear)) {
			switch (type.toLowerCase().trim()) {
			case "next": {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				break;
			}
			case "prev": {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
				break;
			}
			default:
				break;
			}
			
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		selectDate(date);
		
	}
	
	//Future:
		public static void selectFutureDate(String expectedMonthYear, String date) {
			if(expectedMonthYear.contains("February")) {
				//Feb check:
				//leap year: 29 days
				if(Integer.parseInt(date)>29 || Integer.parseInt(date)<=0) {
					throw new EleException("WRONG DATE PASSED...PLS PASS date b/w 1 to 29");
			}
			}
				
			if(Integer.parseInt(date)>31 || Integer.parseInt(date)<=0) {
				throw new EleException("WRONG DATE PASSED...PLS PASS date b/w 1 to 31");
			}
			
			
			
			String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);//May 2024
			
			while(!actMonthYear.equalsIgnoreCase(expectedMonthYear)) {
				//click on next icon:
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			}
			selectDate(date);
		}
		
	
	//prev:
	public static void selectPreviousDate(String expectedMonthYear, String date) {
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//May 2024
		
		while(!actMonthYear.equalsIgnoreCase(expectedMonthYear)) {
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		selectDate(date);
	}
	

	public static void selectDate(String date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();

		
	}

}
