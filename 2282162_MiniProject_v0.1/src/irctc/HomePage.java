package irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillOrigin(String loc) throws InterruptedException {
		WebElement originField = driver.findElement(By.cssSelector("#stationFrom"));
//		Point point = originField.getLocation();
//		System.out.println(point.getX());
//		System.out.println(point.getY());
		originField.sendKeys(loc);
		Thread.sleep(2000);
//		WebElement dayElement= driver.findElement(By.cssSelector("//span[@class='act active-red']"));
//    	dayElement.click();
//		#ui-id-1
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//		actions.moveByOffset(95, 450).click().perform();
//		.sendKeys(Keys.ENTER)
//		WebElement originField1 = driver.findElement(By.xpath("//div[@id='ui-id-945']"));
//		originField1.click();
//		Select drpTravel = new Select(originField1);
//    	drpTravel.selectByVisibleText(fullLoc);
    	
	}
	public void fillDestination(String loc) throws InterruptedException {
		WebElement destinationField = driver.findElement(By.cssSelector("#stationTo"));
		destinationField.sendKeys(loc);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
//		driver.manage().timeouts().setScriptTimeout(10,SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,30);
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
//		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//		.sendKeys(Keys.ENTER)
//		Select drpTravel = new Select(travelField);
//    	drpTravel.selectByVisibleText(text);
	}

    public void findDeparture() {
    	WebElement departureField = driver.findElement(By.cssSelector("#originDate"));
    	departureField.click();
    	WebElement dayElement= driver.findElement(By.xpath("//span[@class='act active-red']"));
    	dayElement.click();
    }
    public void selectChooseClass(String text) {
    	WebElement classField = driver.findElement(By.cssSelector("#noOfpaxEtc"));
    	classField.click();
    	WebElement travelField = driver.findElement(By.cssSelector("#travelClass"));
    	Select drpTravel = new Select(travelField);
    	drpTravel.selectByVisibleText(text);
    }
    public void clickSearchButton() {
    	WebElement clickSearchButton = driver.findElement(By.cssSelector("button[class='btn btn-md yellow-gradient home-btn']"));
    	clickSearchButton.click();
    }
    	
//    	LocalDate currentDate= LocalDate.now();
//    	int dayOfMonth= currentDate.getDayOfMonth();
//    	
//    	for (int i = 1; i < 8; i++) {
//			for (int j = 1; j < 7; j++) {
//				
//				WebElement dayElement= driver.findElement(By.xpath("//span[@class='act active-red']"));
//		    	String dateText = dayElement.getText();
//		    	if(Integer.parseInt(dateText) == dayOfMonth) {
//		    		dayElement.click();
//		    		break;
//			}
//		    	
//			}
//		}
//    }
    
  //button[normalize-space()='Search']
    
    

}
