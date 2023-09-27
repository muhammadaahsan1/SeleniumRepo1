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
		String thisYearPopXpath= "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String thisYearPopAndTodayPopXpath= "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		String birthsThisYearXpath= "//div[text()='This year']//parent::div//span[@rel='births_this_year']";
		String deathsThisYearXpath="//div[text()='This year']//parent::div//span[@rel='dth1s_this_year']";
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Syes Ahsan\\eclipse-workspace\\plumProject\\Resources\\geckodriver.exe" );
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.worldometers.info/world-population/");
		 System.out.println("------------------This is overall population----------------------");
		 printPopulationData(overallPopXpath);  // a single value
		 
		 System.out.println("------------------This is today population data population----------------------");
		 printPopulationData(todayPopXpath);	// 3 values under 'Today' population column
//		 printPopulationData(thisYearPopXpath); // 3 values under 'This Year'
//		 printPopulationData(birthsThisYearXpath); // 1 value 		 
//		 printPopulationData(deathsThisYearXpath); // 1 value 
//		 printPopulationData(thisYearPopAndTodayPopXpath); // 6 values 
		 
		 
		      
		 
		 	}
	
	public static void printPopulationData(String Locator) {
	
		int count =1;
		while (count<11) {
			System.out.println(count + "sec");
			if(count==11) break;
			
		    List<WebElement> populList= driver.findElements(By.xpath(Locator));
		 					 
		    for (WebElement e : populList) {
			 System.out.println(e.getText());
			 }	
		    
		    System.out.println("-------------------------");
		    
		    try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			count++;
		 
		 	}
		
	}
	
}
