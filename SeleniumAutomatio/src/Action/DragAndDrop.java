package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Libraries.Utility;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		 driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 Utility.captureScreenshots(driver,"Before drag and drop");
		 
		 Actions act = new Actions(driver);
		 WebElement src = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		 WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		 
		 act.dragAndDrop(src, dest)
		 .pause(Duration.ofSeconds(2))
		 .moveToElement(dest)
		 .pause(Duration.ofSeconds(2))
		 .release()
		 .pause(Duration.ofSeconds(2))
		 .build()
		 .perform();
		 
		 Utility.captureScreenshots(driver,"After drag and drop");
		 
		 driver.quit();
	}

}
