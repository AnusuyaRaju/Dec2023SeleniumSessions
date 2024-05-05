package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("test");
		
		//InvalidSelectorException: invalid selector: An invalid or illegal selector was specified
		//driver.findElement(By.cssSelector("input[id!!!!=-==='username']")).sendKeys("test");
		
		
		//driver.findElement(By.cssSelector(cssSelector))
		//Below r custom CSS Selector syntax
		
		//id
		//#id
		//tagname#id
		// #username
		// input#username
		
		//class:
		// .class
		// tagname.class
		// .login-email
		// input.login-email
		
		//class + id
		// .class#id
		//#id.class
		// input.login-email#username
		// input#username.login-email
		
		//.c1.c2.c3....cn
		//tagname.c1.c2.c3....cn
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		// input.form-control#username.private-form__control.login-email
		
		//css with attributes:
		// tagname[attr='value'] - css
		//tagname[@attr='value'] - xpath
		
		// input[name='email']
		// input[id='input-email']
		// input[id='input-email'][type='text'][name='email']
		// input#input-email[type='text'][name='email']
		
		//Placeholder: *= means contains and ^= means start with and ends with css is available: $ but ends with xpath is not there
		// input[placeholder*='Address'] -- contains
		// input[placeholder^='E-Mail'] -- starts with
		// input[placeholder$='Address'] ---ends with
		
		
		//text in css : Not available, not supported
		
		//parent to child:
		// form#hs-login > div ---> we r getting only using > symbol direct child -- 8
		// form#hs-login div ---> after id name jus gave it a space with child name - direct + indirect child -- 22
		
		
		//dropdown in css
        //select#Form_getForm_Country > option
        //select#Form_getForm_Country  option
		
		//child to parent: not allowed - backward traversing not allowed in css
		//child to ancestor: not allowed - backward traversing not allowed in css
		//preceding sibling: not allowed - backward traversing not allowed in css
		
		//sibling in css: To capture Immediate following sibling by using + symbol
		// label[for='input-email']+input#input-email -- immediate following sibling
		
		// option[value='Algeria']+option -- immediate following sibling -- only 1
		// option[value='Algeria'] ~ option -- -- all following sibling from Algeria -- more(after all)
		
		
		//comma in css: here we can use username,pwd,login & remember me chk box all in one syntax
		// input#username,input#password,button#loginBtn, input#remember
		
		//IQ - Eg:for comma in css where we can use to check all the locators in one syntax means only one By locator used if no we need to 4 By locators
		//use case to check username,pwd,login & remember me chk box all r in given page or not
//		int mand_fields_count = driver
//				.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
//
//		if (mand_fields_count == 4) {
//			System.out.println("all imp mandatory fields are present on the page");
//		}
		
		
		//not in css:
		// div.form-group > input.form-control:not(#input-email)
		
		
		//index in css:
		// select#Form_getForm_Country > option:nth-of-type(6)
		// select#Form_getForm_Country > option:nth-of-type(n) -- all
		
		
//		select#Form_getForm_Country > option:first-child//1st
//		select#Form_getForm_Country > option:last-child//last
//		select#Form_getForm_Country > option:nth-child(4) or nth-of-type(4)//4th index
//		select#Form_getForm_Country > option:nth-last-child(2)//last 2nd
//		select#Form_getForm_Country > option:nth-child(even)//it will give even index value
//		select#Form_getForm_Country > option:nth-child(odd)//it will give odd index value
//		select#Form_getForm_Country > option:nth-of-type(n+4)//starts from 4th index
//		select#Form_getForm_Country > option:nth-of-type(5n)//multiplication of 5 - 5th,10th,15th index etc.....
		
		//IQ: odd & even in xpath:
		//odd and even in xpath:
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] -- odd
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] -- even
		
		
		//cascaded classes in css:
		//tagname.c1.c2.c3....cn
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"));
		
		
		
		//IQ: Diff b/w xpath & CSS Selector
		
		//                     xpath     vs       css:
			
			//1. performance:      good                good(depends on browser/application how exactly you create the xpath if u've written complete absolute xpath obviously slow)
			//2. syntax: 			complex            simple
			//3. backward:           yes                no
			//4. sibling:            yes                yes -- only following
			//5. text:               yes                no
			//6. ancestor/parent:    yes                no
			//7. ends-with:          no                 yes
			//8. index:               yes               yes+1(1 means some extra advantage)
			//9. not:                 yes               yes
			//10. comma:              no                yes
			//11. SVG:               yes                no
			//12. shadownDOM:        no                 yes
			//13. Psuedo:            no                 yes
			//14. last:              yes                yes
			//15. first:             no                 yes
		
		
		

	}

}
