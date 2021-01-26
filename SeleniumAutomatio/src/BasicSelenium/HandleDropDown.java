package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        System.setProperty("Webdriver.driver.ChromeDriver", "E:\\\\chromedriver.exe");	
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		driver.findElement(By.cssSelector("a#menu_admin_viewAdminModule")).click();
		
		
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("akshaytomarakshdrnfdsnfi");
		/* First drop down */
		WebElement drop_down1 = driver.findElement(By.cssSelector("select#searchSystemUser_userType"));
		drop_down1.click();
        Select ddown1 = new Select(drop_down1);
        ddown1.selectByIndex(2);
        WebElement selected_value1 = ddown1.getFirstSelectedOption();
        System.out.println("After selection selected value is :-->>"+selected_value1.getText());
        
		driver.findElement(By.cssSelector("input.ac_input")).sendKeys("tomarthakurtime");

        /* Second drop down */
		WebElement drop_down2 = driver.findElement(By.cssSelector("select#searchSystemUser_status"));
		drop_down2.click();
        Select ddown2 = new Select(drop_down2);
        ddown2.selectByIndex(1);
        WebElement selected_value2 = ddown2.getFirstSelectedOption();
        System.out.println("After selection selected value is :-->>"+selected_value2.getText());
         
        /*To return values of drop down */
        
        List<WebElement> ddown_element=ddown1.getOptions();
        int total_value = ddown_element.size();
        
        System.out.println("Total values in drop-down"+total_value);
        for(WebElement ele : ddown_element)
        {
        	String Values = ele.getText();
        	System.out.println("Values display are===="+Values);
        }
        
        
        driver.findElement(By.cssSelector("input#searchBtn")).click();
        
        Thread.sleep(5000);
        
        driver.quit();
        
        
   
        
        
        
        

	}

}
