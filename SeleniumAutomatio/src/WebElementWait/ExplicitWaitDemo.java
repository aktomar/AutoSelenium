package WebElementWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://demoqa.com/dynamic-properties");
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		System.out.println("Text Visible --->> "+element.getText());
		
		System.out.println("Element Found..!!");
		
		driver.quit();
		
		
	}

}
