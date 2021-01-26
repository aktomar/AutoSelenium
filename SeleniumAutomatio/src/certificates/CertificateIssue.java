package certificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class CertificateIssue {
	
	
	public static void acceptCertificate() {
		
		
//		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
//		
//		DesiredCapabilities cap = new DesiredCapabilities();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cacert.org/");
		
		driver.quit();
		
		
		
	
	}

}
