package JavaScriptExecutorDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Libraries.HighlightElement;
import Libraries.Utility;

public class DemoToHighlightWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("email"));
		HighlightElement.highLightElement(driver, username);
		Thread.sleep(2000);
		Utility.captureScreenshots(driver, "Highlight first element");
		username.sendKeys("astomar1224@gmail.com");
		
		
		WebElement password = driver.findElement(By.name("pass"));
		HighlightElement.highLightElement(driver, password);
		Thread.sleep(2000);
		Utility.captureScreenshots(driver, "Highlight Second element");
		password.sendKeys("949379393839349");;
		
		
		WebElement login = driver.findElement(By.name("login"));
		Utility.captureScreenshots(driver, "Highlight third element");
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, login);
		login.click();
		
		driver.quit();
	}

}
