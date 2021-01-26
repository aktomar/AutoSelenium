package JavaScriptExecutorDemos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScriptDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		System.getProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("confirm('JS EXECUTOR DEMO IN SELENIUM')");

	}

}
