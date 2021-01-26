package hiddenWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindHiddenWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		
		//When you search element simply by just giving it's Xpath then it's through an exception 
		//driver.findElement(By.id("male")).click();;
		
		//To find hidden element without any exception...
		
		List<WebElement> hidden = driver.findElements(By.id("male"));
		
		int count = hidden.size();
		
		System.out.println("Total Link -->>" + count);
		
		for(int i=0;i<count;i++) {
			
			WebElement ele = hidden.get(i);
			
			int x = ele.getLocation().getX();
			
			if(x!=0) {
				
				ele.click();
				break;
			}
			
			
			
		}
	}

}
