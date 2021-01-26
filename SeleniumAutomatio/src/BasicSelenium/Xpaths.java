package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'/index.php/admin/viewAdminModule\')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'searchSystemUser_userName')]")).sendKeys("rohitprakash");
		driver.findElement(By.xpath("//input[contains(@id,'searchSystemUser_employeeName_empName')]")).sendKeys("sharmarathorsingh");
		
		driver.findElement(By.xpath("//*[starts-with(@id,'searchBtn')]")).click();



		
		
		
		
		
	}

}
