package PageLoadTimeOut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoadTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		
		driver.get("https://www.google.com/");
		
		Timeouts time = driver.manage().timeouts();
		
		time.pageLoadTimeout(3, TimeUnit.SECONDS);
		
		System.out.println("Title -->>"+driver.getTitle());
		
		driver.quit();

	}

}
