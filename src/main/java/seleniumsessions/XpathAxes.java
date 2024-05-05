package seleniumsessions;

public class XpathAxes {

	public static void main(String[] args) {
		
		//parent to direct child: use /
		//form/div/input
		
		//parent to direct + indirect child: use // so we can use it for direct,indirect & combination of both
		//select[@id='Form_getForm_Country']//option
		//div[@id='content']//img
		
		//child to parent: if u want to jump immediate parent then we can use below options
		//input[@id='input-email']/../../../../../../../../../..
		//input[@id='input-email']/parent::div/parent::form 
		// both r same 2nd one where we used parent keyword dats it
		
		
		//If u want to jump direct grand parent then we can use below
		//input[@id='input-email']/ancestor::form
		//input[@id='input-email']/ancestor::form/ancestor::body/ancestor::html
		
		//a[text()='Recurring payments']/ancestor::aside
		
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		//a[text()='Recurring payments']/following-sibling::a[text()='Returns']
		
		//input[@id='input-email']/preceding-sibling::label
		//label[text()='E-Mail Address']/following-sibling::input
		
		//3 ways to find web element:
		//a[text()='Joe.Root']//ancestor::tr/td/input[@type='checkbox']
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		
		
		

	}
	
	

}
