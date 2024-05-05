package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//Xpath: address of the element in the DOM
		//XMLPath
		//1.Absolute xpath - full xpath it might be break eg: they can add some more tags in future like div....., etc it will not work tmrw we should never use it
		//html/body/div[2]/div/div/div[3]/div[2]/div/div/div[2]/h4/a - Absolute xpath example
		//2.Relative xpath(custom xpath)
		
		//1.Using any attribute
		//tagname[@attrname = 'value']
		//input[@id = 'input-email']
		//input[@name='email']
				
		//input[@name] --5 having 5 input elements having name 
		//input[@value='Login'] --1
		
		//2.Using multiple attributes:
		//tagname[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@type='submit' and @value='Login' ] --- 1
		
		//input[@type='submit'] -- 3
		//input[@type='text' or @type='email' ]
		//input[@type and @value='Login'] // and is used to filter out till unique value
		//input[@type and @value]
		//a[@href]
		
		
		//3. text():  text() is jus a function but @ we should use it for attributes only
		//tagname[text()='value']
		//h2[text()='New Customer']
		//a[text()='Desktops']
		
		
		//4.text() and attributes together:
		//tagname[@attr='value' and text()='value']
		//a[@class='dropdown-toggle' and text()='Desktops']
		//a[@class='dropdown-toggle' and text()='Desktops' and @data-toggle='dropdown']
		//a[text()='Desktops' and @class='dropdown-toggle' and @data-toggle='dropdown']
		
		
		//5. contains() with attribute:
		//tagname[contains(@arrName, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
				
		//tagname[contains(@arrName1, 'value') and @attr2='value']
		//input[contains(@placeholder, 'Address') and @name='email']
		//input[contains(@placeholder, 'Address') and @name='email' and contains(@id,'email')]
		//a[contains(@href,'wishlist')]
			
		
		//dynamic ids:
		//<input id=firstname_123 />
		//<input id=firstname_345 />
		//<input id=firstname_900 />
		//<input id=firstname_987 />

		//input[contains(@id,'firstname_')]
		
		
		//6. contains() with text():
		//tagname[contains(text(), 'value')]
		//p[contains(text(), 'Customer service, IT, and CRM software')]
		//a[contains(text(), 'Customer')]
		
		
		//7. contains() with text() and attribute:
		//tagname[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Notebooks') and contains(@href,'category&path')]
				
		//tagname[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
		
		
		//8. starts-with() with attribute: //contains() means value that can be at anywhere but starts-with() should start with that particular value
		//tagname[starts-with(@attr, 'value')]
		//input[starts-with(@placeholder, 'E-Mail')]
			
		
		//9. starts-with() with text():
		//tagname[starts-with(text(),'value')]
		//a[starts-with(text(),'Forgotten')]
		
		
		//dynamic ids:
		//<input id=firstname_123_login />
		//<input id=456_firstname_login />
		//EXT JS
				
		//input[contains(@id,'firstname_') and contains(@id,'_login')]
		
		
		//10. IQ: ends-with() is not supported in xpath. It was there earlier with one library now in modern browsers it won't support ends with()
		
		
		//11. index based xpath: //Right way of using index is always store it in a capture group & supply the index in a square bracket and better to avoid index based xpath bcus in future it may varry
		// (//a[text()='Forgotten Password'])[1]
		// (//a[@class='list-group-item'])[13]
		// (//input[@class='form-control'])[6]
		// (//input[@class='form-control'])[position()=4] //IQ: both position()=[4] & [4] r giving same o/p
		// (//input[@class='form-control'])[4]
		// (//input[@class='form-control'])[last()]
		
		
		//IQ: how will u verify position of specific web element...? 
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()] // eg: position 8
				
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-last()+1] // last - last = 0+1 = 1
		
		
		
		//By fgt_pwd = By.xpath("(//a[text()='Forgotten Password'])[1]");
				
				//* - give me all the HTML tag elements
				//*[@id]
				//*[@class='form-control'] -- 100 ---> 6 - Generally we should avoid * kind of search bcus it will give everything
				//input[@class='form-control'] -- 20 ---> 6
				//*[@href]
				
		
		        //in DOM we could see it as " Yes" or " No" inside label tag then we can use below syntax using normalize-space()
				//label[normalize-space()='No']
		        //label[normalize-space()='Yes']
		
		
		

		

	}

}
