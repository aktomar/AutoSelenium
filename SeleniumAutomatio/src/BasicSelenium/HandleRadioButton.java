package BasicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\chromedriver.exe");
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		 driver.findElement(By.xpath("//input[@name='lang' and @value='JAVA'] ")).click();
		 
		 driver.findElement(By.xpath("//input[@id='sing' and@ type='checkbox'] ")).click();
		
		/*
		 * for(int i=0;i<radio.size();i++) { WebElement local_radio=radio.get(i);
		 * 
		 * String value=local_radio.getAttribute("Value");
		 * System.out.println("VAlue displayed Are :->>>"+ value);
		 * 
		 * }
		 */
	

	}

}
