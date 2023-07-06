package irctc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.List;
//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class DisplayPage {

	private WebDriver driver;
	
	public DisplayPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkOrigin(String loc) {
		WebElement originField = driver.findElement(By.cssSelector("#stationFrom"));
		String originText= originField.getAttribute("value");
//		System.out.println(originText);
		if (originText.equals(loc)) {
			System.out.println("stationfrom: Test Case Passed");
		}
		else System.out.println("stationfrom: Test Case Failed");
	}
	
	public void checkDestination(String loc) {
		WebElement destinationField = driver.findElement(By.cssSelector("#stationTo"));
		String destinationText= destinationField.getAttribute("value");
//		System.out.println(destinationText);
		if (destinationText.equals(loc)) {
			System.out.println("stationTo: Test Case Passed");
		}
		else System.out.println("stationTo: Test Case Failed");
	}
	
    public void checkDeparture() {
    	WebElement departureField = driver.findElement(By.cssSelector("#originDate"));
    	String departureText= departureField.getAttribute("value"); 	
    	LocalDate currentDate= LocalDate.now();
    	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	String currentDateString= currentDate.format(formatter);
//		System.out.println(currentDateString);
//		System.out.println(departureText);
		if (departureText.equals(currentDateString)) {
			System.out.println("originDate: Test Case Passed");
		}
		else System.out.println("originDate: Test Case Failed");
	}
    
    public void displayDetails(){
//    	List<String> detailsList=new ArrayList<>();   	
//		String numText= numField.getAttribute("value");
    	System.out.println("Available Flights: ");
		
//		for (int i = 3; i < 31; i++) {		
//			WebElement nameField = driver.findElement(By.xpath( "//body[1]/app-root[1]/app-oneway[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[" + String.valueOf(i) + "]/div[1]/div[1]/div[2]/b[1]" ));
//			String nameText= nameField.getText();	    	
//			WebElement numField = driver.findElement(By.cssSelector( "body > app-root:nth-child(3) > app-oneway:nth-child(3) > div:nth-child(3) > main:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(" + String.valueOf(i) + ") > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(2)" ));
//			String numText= numField.getText();
//			System.out.println("Name: " + nameText + " / Number: " +numText);
//					
//		}
    	
    	List<WebElement> detailField = driver.findElements(By.className("right-searchbarbtm-in"));
    	
    	for(WebElement detail : detailField) {		
    		String fullDetail = detail.getText();
    		String[] fullDetailList = fullDetail.split("\\n");
    		
    		System.out.println("Name: " + fullDetailList[0] + " / Number: " +fullDetailList[1]);
    		
    	}
    	
//		System.out.println("Available Flights: ");
//		for(String details : detailsList) {
//			System.out.println(details);
//		}
		
    	
    }
    
   
}
