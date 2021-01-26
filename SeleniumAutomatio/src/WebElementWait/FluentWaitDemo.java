package WebElementWait;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\\\chromedriver.exe");
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	

	}

}
