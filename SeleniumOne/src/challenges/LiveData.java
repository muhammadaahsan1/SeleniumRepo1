package challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LiveData {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String overallPopXpath ="//div[@class='maincounter-number']/span[@class='rts-counter']";
		String todayPopXpath= "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Syes Ahsan\\eclipse-workspace\\plumProject\\Resources\\geckodriver.exe" );
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.worldometers.info/world-population/");
		 
//		 printPopulationData(overallPopXpath);
		 printPopulationData(todayPopXpath);
		 
		 

	}
	
	public static void printPopulationData(String Locator) {
	while (true) {
		 List<WebElement> populList= driver.findElements(By.xpath(Locator));
		 					 
		 for (WebElement e : populList) {
			 System.out.println(e.getText());
			 }
		 
		 }
	}
	
}
