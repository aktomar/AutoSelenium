package BootStrapLoginWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapLoginWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.goibibo.com/flights/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a#get_sign_in")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.cssSelector("input#authMobile")).sendKeys("73020834543");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		


	}

}
