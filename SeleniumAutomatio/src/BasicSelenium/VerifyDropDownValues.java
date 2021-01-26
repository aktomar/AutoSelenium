package BasicSelenium;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class VerifyDropDownValues {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\\\\\chromedriver.exe");
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select tools = new Select(driver.findElement(By.id("tools")));
		
		List actualList = new ArrayList();
		
		List<WebElement> myTools = tools.getOptions() ;
		
		for(WebElement ele : myTools) {
			
			String data = ele.getText();
			actualList.add(data);
			
		}
		System.out.println("Values in actuals List Are : ->"+actualList);
		
		List temp = new ArrayList();
		temp.addAll(actualList);
		
		//Ascending
		Collections.sort(temp);
		System.out.println("Values in Temp Are : ->"+temp);
		
		Thread.sleep(5000);
	
		
		//Assert.assertTrue(actualList.equals(temp));
		
		

	}

}
