package Action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.softwaretestinghelp.com/handle-mouse-clicks-in-selenium/");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("iframeResult");
		
		Actions act = new Actions(driver);
		
		//act.contextClick();
		
		act.contextClick(driver.findElement(By.xpath
		("//a[@href='https://cdn.softwaretestinghelp.com/wp-content/qa/uploads/2020/06/click_html.png']"))).perform();
		
		//driver.switchTo().alert().accept();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		//Count all the windows opened
		@SuppressWarnings("unused")
		int count = allWindows.size();
		System.out.println("Total Window"+driver.getTitle());
		

		Thread.sleep(2000);
		
		System.out.println(" Right Mouse Button Clicked !");
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
		

	}

}
