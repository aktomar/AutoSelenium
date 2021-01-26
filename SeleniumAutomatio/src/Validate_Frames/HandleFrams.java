package Validate_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HandleFrams {
	
	@Test
	public void iframes() throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		int total_frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frame on WebPages Are -->>"+total_frame);
		
		
		//Switch to frame
		driver.switchTo().frame("frame1");
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text display on IFrame ->>"+text.getText());
		
	
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
