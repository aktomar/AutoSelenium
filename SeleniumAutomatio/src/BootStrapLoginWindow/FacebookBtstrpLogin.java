package BootStrapLoginWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBtstrpLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a#u_0_2")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div[2]"));
	
		
		driver.findElement(By.cssSelector("input#u_1b_b")).sendKeys("jhhfhfgff");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
