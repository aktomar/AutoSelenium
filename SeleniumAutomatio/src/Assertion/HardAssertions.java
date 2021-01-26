package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void HardAssertionone() {
		
		System.out.println("Started test 1");
		Assert.assertEquals(23, 24,"Test failed and SCRIPT TERMINATED"); //Assertion failed
		System.out.println("Completed test 1"); //It'll not print because our TC failed so it's a hard assertion
		
	}
	@Test
	public void HardAssertionTwo() {
		
		System.out.println("Started test 2");
		Assert.assertEquals(23, 23);
		System.out.println("Completed test 2"); //Not TC fail so it'll print this line
		
	}
	

}
