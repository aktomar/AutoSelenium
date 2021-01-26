package FindBrokenLinksOnWebpage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.driver.ChromeDriver","E:\\chromedriver.exe");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Link Available on Page are -->"+links.size());
		
		for(int i=0;i<links.size();i++) {
			
			WebElement ele = links.get(i);
			
			String url = ele.getAttribute("href");
			
			verifyLinkActive(url);
			
			
		}

	}
	
	
		public static void verifyLinkActive(String linkurl)
		{
			
			try
			{
				URL url = new URL(linkurl);
				
				HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
				
				httpURLConnect.setConnectTimeout(3000);
				
				httpURLConnect.connect();
				
				if(httpURLConnect.getResponseCode()==200)
				{
					System.out.println(linkurl+" -" +httpURLConnect.getResponseMessage());
				}
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
				{
					
					System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage()+" - " +HttpURLConnection.HTTP_NOT_FOUND);
				}
			}catch(Exception e) {
			}
		}
			
			
   }


