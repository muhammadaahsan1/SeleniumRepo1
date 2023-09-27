package challenges;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class DarazLogin {
   static WebDriver driver;
   static String eBayUrl ="https://www.ebay.com/";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		

		
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Syes Ahsan\\eclipse-workspace\\plumProject\\Resources\\geckodriver.exe" );
		 driver = new FirefoxDriver();
		 String baseUrl = "https://www.daraz.pk/";
		 driver.get(baseUrl);
		
		try {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		 driver.findElement(By.xpath("//div/a[text()='Signup']")).click();
		 driver.findElement(By.xpath("//div/input[@placeholder='Please enter your phone number']")).sendKeys("0333333337");
		 driver.findElement(By.xpath("//div/input[@placeholder='Enter your first and last name']")).sendKeys("One");
		 driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters with a number and a letter']")).sendKeys("$uperman7");

		 WebElement month = driver.findElement(By.xpath("//span[@id='month']"));
		 WebElement day = driver.findElement(By.xpath("//span[@id='day']"));
		 WebElement year = driver.findElement(By.xpath("//span[@id='year']"));
		 WebElement gender = driver.findElement(By.xpath("//span[@id='gender']"));
		 
		 
//		 Select select = new Select(month);
//		 select.selectByVisibleText("July");
		 
		 //also the following can be done thru sendKeys
		 //try catch
		 //login
		 // Take till checkout
		 //parallel testing
		 //error Handling
		 //TestNG
		 
		 month.click();
		 driver.findElement(By.xpath("//li[text()='October']")).click();
		 day.click();
		 driver.findElement(By.xpath("//li[text()='07']")).click();
		 year.click();
		 driver.findElement(By.xpath("//li[text()='2015']")).click();
		 gender.click();
		 driver.findElement(By.xpath("//li[text()='male']")).click();
		 
		
		 
		 
		 driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		 
		}
		
		catch(Exception e) {
			System.out.println("There is something wrong with the code above");
		}
		 
		 
		login();
		buyProduct();
	}
	
	
	static void login() throws InterruptedException {
		
		driver.get(eBayUrl);
		
		
//		driver.findElement(By.xpath("//span/a[text()='Sign in']")).click();
//		driver.findElement(By.id("userid")).sendKeys("ahsan.g@plumlogix.com");
//		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("$uperman7");
//		driver.findElement(By.xpath("//Button[@id='sgnBt']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='checkbox']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class='button-submit button']")).click();
		
		
}
	static void buyProduct() throws InterruptedException {
		
		driver.get(eBayUrl);
		driver.findElement(By.id("gh-ac")).sendKeys("Map of the world"); //.sendKeys(Keys.RETURN);
		driver.findElement(By.id("gh-btn")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//div/span[text()='A1 Large Map of the World Poster atlas wall chart educational school print']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Buy It Now')]")).click();
		
		 
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Buy It Now')]")).click();
		
		String acutaltext ="s";
		String expectedtext ="a";
		org.junit.Assert.assertEquals(acutaltext,expectedtext);
		
		System.out.println("Execution Done");
		//add 3 more products in cart and verify the quantity
		
	
	}
	
}

