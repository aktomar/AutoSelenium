package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		
		  //id 
		  WebElement uname = driver.findElement(By.id("txtUsername"));
		  uname.sendKeys("Admin");
		  
		  //name 
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  
		  //ClassName - Many time class name won't be unique
		  driver.findElement(By.className("textInputContainer")).click();
		  
		  //Xpath
		  driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		  
		  //CSS Selector
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Admin123");
		 

		// link text
		driver.findElement(By.linkText("Forgot your password?")).click();

		// partial link text
		driver.findElement(By.partialLinkText("Forgot your")).click();

		// TagName -> Give no of images for now
		System.out.println(driver.findElements(By.tagName("img")).size());

		driver.quit();

	}

}
