package WindowsAndPopup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID-->> "+parent);
		
		driver.findElement(By.id("newTabsBtn")).click();
		
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		Thread.sleep(2000);

		
		driver.switchTo().window(tabs.get(0));
		driver.close();
		Thread.sleep(2000);

		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
