package AlertBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class verifyAlertBox {
	
	@Test
	public void alertbox() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#bookingsForm > div > div > div:nth-child(2) > div.col-md-2.mb-1.booking-input > button")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

		
	
		
		
		
		//accept - Used for "YES"
		//Dismis - Used for "No"
	
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
