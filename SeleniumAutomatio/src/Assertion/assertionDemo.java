package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionDemo {
	
	@Test
	public void assertiontypeone() {
		
		
		Assert.assertEquals(23, 24);
		
	}

	@Test
	public void assertiontypetwo() {
		
		
		Assert.assertEquals(24, 24,"Actual result not same as expected result");
		
	}
	

	@Test
	public void assertiontypethree() {
		
		
		Assert.assertTrue(false,"Conditons faild");
		
	}
	
	@Test
	public void assertiontypefour() {
		
		
		Assert.assertTrue(true,"Conditons faild");
		
	}
	

}
