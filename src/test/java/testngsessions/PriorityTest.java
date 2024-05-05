package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//IQ: priority combination questions....?
	//default priority is 0 if we don't give priority means = 0
	//if we give priority in the combination of -ve,0,5,4,1 means results will be -ve,0,1,4,5
	//if we give priority in the combination of duplicates 1,1,1,2,3 means results will be all duplicates should filter out by alphabetical order n the will print
	//if we give priority in the combination of 1,no priority,-1,2,3 means results will be -1,no priority,1,2,3
	//1st non priority run first n then priority combos will run
	
	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}
	
	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}
	
	@Test(priority = 3)
	public void cTest() {
		System.out.println("c test");
	}
	
	@Test(priority = -1)
	public void aTest() {
		System.out.println("a test");
	}
	
	@Test
	public void bTest() {
		System.out.println("b test");
	}

}
