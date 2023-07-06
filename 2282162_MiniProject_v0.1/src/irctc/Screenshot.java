package irctc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public void captureScreenshot(WebDriver driver, String filename) {
		File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String destinationPath= "C://Users//2282162//Desktop//javaWS//2282162_MiniProject_v0.1//screenshots//"+filename;
	    
	    try {
	    	FileUtils.copyFile(screenshotFile, new File(destinationPath));
//	    	System.out.println("saved");
	    	screenshotFile.delete();
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }

	}
	
    
}
