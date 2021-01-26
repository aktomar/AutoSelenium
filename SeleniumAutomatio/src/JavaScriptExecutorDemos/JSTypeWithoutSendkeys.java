package JavaScriptExecutorDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTypeWithoutSendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.getProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.name("username"));
		
		js.executeScript("arguments[0].value='randomname'",email);
		
		Thread.sleep(3000);
		
		js.executeScript("confirm('USER NOT ENTER a VALID USER NAME,WANT TO CONTINUE ??')");

	
	}

}
