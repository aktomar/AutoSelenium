package PageLoadTimeOut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		
		System.out.println("Title -->>"+driver.getTitle());
		
		driver.quit();

	}

}
