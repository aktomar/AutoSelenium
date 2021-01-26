package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapeDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\\\\\chromedriver.exe");
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu1")).click();

		List<WebElement> dd_element = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu test\"][@aria-labelledby='menu1']"));
		
		for(WebElement ele:dd_element) {
			
			String innerhtml = ele.getAttribute("innerHTML");
			if(innerhtml.contentEquals("JavaScript")) {
				
				ele.click();
				break;
			}
			
			System.out.println("Value for drop down are==="+innerhtml);
		}
		
		

	}

}
