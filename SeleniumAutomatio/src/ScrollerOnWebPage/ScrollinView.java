package ScrollerOnWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollinView {
	
	@Test
	public static void viewScrill() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		driver.get("https://gromo.github.io/jquery.scrollbar/demo/basic.html");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"anchor\"]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		System.out.println(element.getText());
		
		driver.quit();
		
		
		
	}

}
