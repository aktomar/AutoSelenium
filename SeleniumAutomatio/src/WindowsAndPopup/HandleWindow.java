package WindowsAndPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Libraries.Utility;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		
		//For Parent Window
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is"+parent);
		
		Utility.captureScreenshots(driver, "VerifyWindow1");
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		//Capture all windows in set through their ID's
		Set<String> allWindows = driver.getWindowHandles();
		
		//Count all the windows opened
		int count = allWindows.size();
		System.out.println("Total Window"+count);
		
		for(String child : allWindows) {
			//parent window iD to child ID....if not eqaul then switch to child window (2nd window)
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				Utility.captureScreenshots(driver, "VerifyWindow2");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selelniumhq");
				Utility.captureScreenshots(driver, "VerifyElementOn2ndWindow");
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		
		//Again switch to child window
		driver.switchTo().window(parent);
		System.out.println("Parent Window Title is"+driver.getTitle());
		driver.quit();
		
		
		
		
		

	}

}
