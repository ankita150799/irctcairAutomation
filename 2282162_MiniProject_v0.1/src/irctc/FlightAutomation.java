package irctc;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import java.io.*;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v112.page.Page.CaptureScreenshotFormat;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FlightAutomation {
	static Screenshot ss = new Screenshot();
//	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//2282162//Desktop//javaWS//2282162_MiniProject_v0.1//drivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.air.irctc.co.in/");
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        DisplayPage displayPage= new DisplayPage(driver);
        
//        File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        String destinationPath= "C://Users//2282162//Desktop//javaWS//2282162_MiniProject_v0.1//screenshots"
        
        homePage.fillOrigin("Hyd");
        ss.captureScreenshot(driver, "originScreenshot.jpg");
        homePage.fillDestination("Pune");
        ss.captureScreenshot(driver, "destinationScreenshot.jpg");
        homePage.findDeparture();
        ss.captureScreenshot(driver, "departureScreenshot.jpg");
        homePage.selectChooseClass("Business");
        ss.captureScreenshot(driver, "classScreenshot.jpg");
        homePage.clickSearchButton();
        ss.captureScreenshot(driver, "searchScreenshot.jpg");
        
        Thread.sleep(5000);
        displayPage.checkOrigin("Hyderabad (HYD)");
//        ss.captureScreenshot(driver, "screenshot6.jpg");
        displayPage.checkDestination("Pune (PNQ)");
//        ss.captureScreenshot(driver, "screenshot7.jpg");
        displayPage.checkDeparture();
//        ss.captureScreenshot(driver, "screenshot8.jpg");
        displayPage.displayDetails();
        ss.captureScreenshot(driver, "detailsScreenshot.jpg");
        
        driver.quit();


	}

}
