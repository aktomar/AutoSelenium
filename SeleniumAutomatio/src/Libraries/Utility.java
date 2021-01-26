package Libraries;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {
	
	public static void captureScreenshots(WebDriver driver,String ScreenShots) {
	
	try {
			
			
				TakesScreenshot ts = (TakesScreenshot)driver;
			
				File source =ts.getScreenshotAs(OutputType.FILE);
				
				Files.copy(source,new File("./Captured Screenshots/"+ScreenShots+".png"));
	} 
	
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		   System.out.println("Exception occurs while taking SceeenShots"+e.getMessage());
	}
	
 

		}
	
}
