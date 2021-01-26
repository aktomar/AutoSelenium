package WindowsAndPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window ID -->> "+parent);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> AllWindow = driver.getWindowHandles();
		int Count = AllWindow.size();
		System.out.println("Total Windows are -->>"+Count);
		
		
		for(String child : AllWindow) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				
				driver.switchTo().window(child);
				System.out.println("Title of Child Window"+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
					}
			
			}
		
		driver.switchTo().window(parent);
		System.out.println("Title of parent Window"+driver.getTitle());
		driver.quit();

		}

}
