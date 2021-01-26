package ScrollerOnWebPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class JsScroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
	
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(5000);
		//to scroll page 4oopx vertically
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		System.out.println("Page Scrolled down Successfully !!");
		
		//driver.quit();

	}

}
