package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		 driver.get("https://jqueryui.com/draggable/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 
		 Actions act = new Actions(driver);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		 
		 WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 act.dragAndDropBy(src,146,69).perform();
		 
		 //Thread.sleep(3000);
		 
		 driver.quit();
		 
		 }

}
