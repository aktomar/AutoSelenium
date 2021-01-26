package ValidateTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyWithGetTitle {
	
    @Test
	public void VerfiyTitleOne() {
    	
    	WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	driver.manage().window().maximize();
    	
    	//Actual title
    	String actual_title = driver.getTitle();
    	
    	System.out.println("Actual Title"+actual_title);
    	
    	String expacted_title = "OrangeHRM";
    	
    	//Verify with assertions
    	Assert.assertEquals(actual_title, expacted_title);
    	
    	System.out.println("TestCase Passed");
    	
    	}
    @Test
	public void VerfiyTitleTwo() {
    	
    	WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	driver.manage().window().maximize();
    	
    	//Actual title
    	String actual_title = driver.getTitle();
    	
    	System.out.println("Actual Title"+actual_title);
    	
    	String expacted_title = "Orange";
    	
    	//Verify with assertions
    	Assert.assertEquals(actual_title, expacted_title);
    	
    	System.out.println("TestCase Failed");
    	
    	}

}
