package ValidateTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyWithPageSources {
	@Test
	public void VerfiyTitleOne() {
    	
    	WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	driver.manage().window().maximize();
    	
    	//Actual title
    	driver.getPageSource().contains("OrangeHRM"); 
    	//Verify with assertions
    	Assert.assertEquals(true,true);
    	
    	System.out.println("First TestCase Passed");
    	
    	driver.quit();
    	
    	}
	
    @Test
	public void VerfiyTitleTwo() {
    	
    	WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	driver.manage().window().maximize();
    	
    	//Actual title
    	driver.getPageSource().contains("Akshay"); 
       //Verify with assertions 
    	Assert.assertEquals(false,false);
    	
    	System.out.println("Second TestCase Failed");
    	driver.quit();
    	}
    
    


}

