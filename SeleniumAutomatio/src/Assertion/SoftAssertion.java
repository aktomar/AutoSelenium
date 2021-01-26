package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void SoftassertionOne() 
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started TestCase 1....");
		assertion.assertEquals(34, 67,"Test Case Failed");
		System.out.println("Completed TestCase 1...."); //In soft this will also print either assertion is failed.
		assertion.assertAll();
		
	}
	@Test
	public void Softassertiontwo() 
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started TestCase 2....");
		assertion.assertEquals(34, 34,"Test Case Failed");
		System.out.println("Completed TestCase 2...."); //In soft this will also print either assertion is failed.
		assertion.assertAll();
		
	}


	

}
