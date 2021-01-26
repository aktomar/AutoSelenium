package Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import Libraries.Utility;

public class MouseHoverOpertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act = new Actions(driver);
		
		
		//Simpley to hover mouse....
		act.moveToElement(ele).perform();
		
		//Utility.captureScreenshots(driver, "Mouse Hover");
		
		
		//Store each element in list display after hover mouse
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int count = links.size();
		
		for(int i=0;i<count;i++) {
		
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			//If user verify link is enabled or disabled,it return boolean value enabled:True and disabled:False,
			Boolean status = element.isEnabled();
			System.out.println("Link Text --->> "+text +" And Link status ->>>"+status);
			//if User want to navigate particular text
			if(text.equalsIgnoreCase("Appium")) {
				
				element.click();
				System.out.println("User Successfully Navigated to Page ...!");
				break;
			}
		}
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
