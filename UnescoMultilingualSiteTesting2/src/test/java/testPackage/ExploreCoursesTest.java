package testPackage;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReaderPkg.ConfigPropReader;
import driverFactory.DriverFactory;
import pages.HomePage;
import pages.SignInPage;

public class ExploreCoursesTest {
	
	//0.0 to call methods in classes I created earlier, I have maintained the class's reference here
		DriverFactory df;
		ConfigPropReader cp;
		Properties prop;   //properties is an in-built method of Java, Properties is a subclass of Hashtable. It is used to maintain a list of values in which the key is a string and the value is also a string i.e; it can be used to store and retrieve string type data from the properties file. Properties class can specify other properties list as it's the default.
		WebDriver driver;  //creating WebDriver instance here for the test class and later will store the result coming from initializeDriver method of DriverFactory Class
		HomePage homePage; 
		SignInPage signInPage;
		SignInTest signInTest; //To sign in for the current test, 
		WebDriverWait webdwait;
		
		
		
		//0.1 setting up setup and teardown methods under BeforeTest and AfterTest annotations respectively
		@BeforeTest
		public void setup() {
			
			//0.3 Inside Before Test; creating objects of classes 1st to call methods inside them
			cp = new ConfigPropReader();
			prop = cp.initializeLangProp("english");//change the language here for the site
			df = new DriverFactory();
			driver = df.initializeDriver("firefox", prop);
			homePage = new HomePage(driver);
			signInPage = new SignInPage(driver);
			signInTest = new SignInTest(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
//			webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

			
			
			
			
		}
		
		@Test(priority=1)
		public void checkExploreCourses() throws InterruptedException {
			
			signInTest.signInToEdx();
			
			
			driver.findElement(By.xpath("//a[@class='btn btn-brand']")).click(); //Explore Button
		
			driver.navigate().refresh();
			Thread.sleep(10000);
			//Dealing with Permanent Overlay, Amazing!!!!!!
		     String inputText = "Testing";
		     WebElement myElement = driver.findElement(By.id("pgn-searchfield-input-11"));
		     String js = "arguments[0].setAttribute('value','"+inputText+"')";
		     ((JavascriptExecutor) driver).executeScript(js, myElement);
//			driver.findElement(By.xpath("//div[@id='nav-search-desktop-search-input']/input[@placeholder='What do you want to learn?']")).sendKeys("Testing");
			driver.findElement(By.xpath("//button[@id='main-search-search-submit']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Test and Behavior Driven']")).click();
			
//			System.out.println(prop.getProperty("searchPlaceholder"));//just for checking which value it is taking 
//			System.out.println("***************$$$$$$$$$$*****************");
			
//			Assert.assertTrue(homePage.isPlaceholderExist(prop.getProperty("searchPlaceholder")));
			
			
		}
		//0.4 A test to assert that contact element exists on the UI of un.org/fr website
//		@Test(priority=2)
//		public void checkContactExist() {
//			System.out.println("**********$$$$$$$$$$$$**********************");
//			System.out.println(prop.getProperty("contactUs"));//just for checking which value it is taking 
//			System.out.println("***************$$$$$$$$$$*****************");
//			Assert.assertTrue(homePage.isContactExist(prop.getProperty("contactUs")));//1. Assert to make sure that contact exist on the UI, this will send the value of contact from properties to the method isContactExist
//			
	//	
//			
//		}	
		
		@AfterTest
		public void teardown() {
			
//			driver.quit();
		}

}
