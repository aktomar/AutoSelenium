package CaptureScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CaptureScreenshot {
	
	
	@Test
	public void screenshots() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(source,new File("./Captured Screenshots/OrangeHRM.png"));
		
	    System.out.println("SceeenShots Taken");
		 
		driver.quit();
		
		
		
		
	}

}
