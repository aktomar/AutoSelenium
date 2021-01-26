package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		 driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 Actions act = new Actions(driver);
		 WebElement src = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		 WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		 
		 act.dragAndDrop(src,dest).perform();
		 
		 
		 
		 Thread.sleep(3000);
		 
		 System.out.println("Draged item successfully");
		 
		 
		 
		 driver.quit();
		 
		 

	}

}
