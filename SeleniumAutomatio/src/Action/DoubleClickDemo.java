package Action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.softwaretestinghelp.com/handle-mouse-clicks-in-selenium");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath
		("//a[@href='https://cdn.softwaretestinghelp.com/wp-content/qa/uploads/2020/06/click_html.png']"))).perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		
		
		int count = allWindows.size();
		System.out.println("Total Window -->>"+count);
		

		Thread.sleep(2000);
		
		System.out.println(" Double Clicked !");
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
