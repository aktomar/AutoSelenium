package CaptureScreenshots;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Libraries.Utility;

public class TakeSSfromUtilityClass {	
	
	
	@Test
	public void Screenshots() throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
			System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			
			Utility.captureScreenshots(driver,"Browser Started");
			
			driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
			
			driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
			
			Utility.captureScreenshots(driver,"EnterDetails");
			
			driver.findElement(By.cssSelector("input#btnLogin")).click();
			
			Thread.sleep(5000);
			
			Utility.captureScreenshots(driver,"HomeScreen");
			
			Thread.sleep(2000);
			
			System.out.println("ScreenShots Taken");
			
			driver.quit();


	}

}
