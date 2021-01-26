package JavaScriptExecutorDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsClickOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		System.getProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		//Type :01 js.executeScript("document.getElementById('persistent').click()");
		
		//User also perform same with arguments..
		
		//Type:02
		
		WebElement Checkbox = driver.findElement(By.id("persistent"));
		
		js.executeScript("arguments[0].click()",Checkbox);
		

	}

}
