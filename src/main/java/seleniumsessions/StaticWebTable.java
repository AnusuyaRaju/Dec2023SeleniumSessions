package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//tbody - table body
		//tr - table row
		//th - table header
		//td - table data
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//IQ: How to print the values from specific column...? 
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("total row counts = " + (rowCount-1));//row size
		
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("total col count = " + columnCount);
		
		//1st column:
		////*[@id="customers"]/tbody/tr[2]/td[1]
		////*[@id="customers"]/tbody/tr[3]/td[1]
		////*[@id="customers"]/tbody/tr[4]/td[1]
		////*[@id="customers"]/tbody/tr[5]/td[1]
		////*[@id="customers"]/tbody/tr[7]/td[1]
		
		//2nd column:
		////*[@id="customers"]/tbody/tr[2]/td[2]
		
//		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
//		String afterXpath = "]/td[1]";
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[2]";
		
//		for(int row=2; row<=rowCount; row++) {
//			String comXpath = beforeXpath + row + afterXpath;
//			//System.out.println(comXpath);
//			String text = driver.findElement(By.xpath(comXpath)).getText();
//			System.out.println(text);
//		}
		
		
		//To printing row wise all the table datas:
		
//		List<WebElement> tableDataList = driver.findElements(By.xpath("//th[text()='Company']//parent::tr/following-sibling::tr/td"));
//		for(WebElement e : tableDataList) {
//			System.out.println(e.getText());
//		}
		
		//IQ: print all the column values using xpath at a time...? we can use below 2 xpath
		
		////th[text()='Company']//parent::tr/following-sibling::tr/td[3]
		////table[@id='customers']//tr/td[1]
		
		for(int col=1; col<=columnCount; col++) {
			List<WebElement> colData = driver.findElements(By.xpath("//table[@id='customers']//tr/td["+col+"]"));
			for(WebElement e : colData) {
				System.out.println(e.getText());
			}
		}

	}
	

}
