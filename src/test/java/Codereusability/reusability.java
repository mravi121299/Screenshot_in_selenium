package Codereusability;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class reusability {
	public static void capturedSS(WebDriver driver,String screenShotName) {	
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Screenshots/"+screenShotName+ ".png"));
			System.out.println("captured ScreenShot - By Selenium Webdriver");
		} catch (IOException e) {
		
			System.out.println("Exception while taking screenshot"+ e.getMessage());
		}	
	}
}
