package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		
		options.merge(cap);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https:www.google.com");


	}

}
