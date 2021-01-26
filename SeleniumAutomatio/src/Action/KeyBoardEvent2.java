package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).perform();
	    act.pause(Duration.ofSeconds(1));
		
		if(driver.findElement(By.xpath("//p[text()='You entered: ESCAPE']")).getText().contains("ESCAPE"));
		
		{
			System.out.println("Key Pressed !");
		}
		
		
		driver.quit();
		

	}

}
