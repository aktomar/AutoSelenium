package generateLogs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogsDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger("LogsDemo");
		
		PropertyConfigurator.configure("E:\\FIle to Generate logs\\Log4j.properties");
		
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		logger.info("Browser Opened");
		
		driver.get("https://www.facebook.com/");
		logger.info("Facebook Opened");
		
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("astomar645@gmail.com");
		logger.info("Mail ID entered");

		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("8982405026");
		logger.info("Password entered");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		logger.info("Login button clicked");
		
		driver.quit();
		
		
	}

}
