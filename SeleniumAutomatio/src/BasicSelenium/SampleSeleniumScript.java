package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("astomar645@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("8982405026");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		driver.quit();

		
		

	}

}
