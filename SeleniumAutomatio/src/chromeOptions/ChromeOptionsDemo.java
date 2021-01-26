package chromeOptions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-infobars");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("hhtp://www.google.com");
		
		driver.quit();

	}

}
