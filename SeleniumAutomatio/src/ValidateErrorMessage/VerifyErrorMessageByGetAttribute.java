package ValidateErrorMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessageByGetAttribute {

	@Test
	public void verifyErrorMessage() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("akshay");
		
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		String actual_error = driver.findElement(By.xpath("//span[@id='spanMessage']")).getAttribute("innerHTML");
		
		String expacted_error = "Password cannot be empty";
		
		//Type1
		Assert.assertEquals(actual_error, expacted_error);
		
		//Type2 - Just checking for error message contains any text...
		Assert.assertTrue(actual_error.contains("Password cannot be ") );
		
		System.out.println("Error Message  Verified");
		
		driver.quit();
		
	}
}
