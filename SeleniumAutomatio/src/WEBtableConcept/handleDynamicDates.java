package WEBtableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDynamicDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
		
		int total_node = dates.size();
		
		for(int i=0;i<total_node;i++) {
			
			String date = dates.get(i).getText();
			
			if(date.equalsIgnoreCase("31"))
			{
				
				dates.get(i).click();
				break;
			}			
			
		}
			
	}

}
