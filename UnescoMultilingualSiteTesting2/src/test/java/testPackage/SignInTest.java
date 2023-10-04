package testPackage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReaderPkg.ConfigPropReader;
import driverFactory.DriverFactory;
import pages.HomePage;
import pages.SignInPage;

public class SignInTest {
	
	//0.0 to call methods in classes I created earlier, I have maintained the class's reference here
	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;   //properties is an in-built method of Java, Properties is a subclass of Hashtable. It is used to maintain a list of values in which the key is a string and the value is also a string i.e; it can be used to store and retrieve string type data from the properties file. Properties class can specify other properties list as it's the default.
	private WebDriver driver;  //creating WebDriver instance here for the test class and later will store the result coming from initializeDriver method of DriverFactory Class
	HomePage homePage; 
	SignInPage signInPage;
	
	
	public SignInTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=1)
	public void signInToEdx() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Main menu']")).click(); //for French //button[@title='Menú principal']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click(); ////a[normalize-space()='Iniciar sesión']
		driver.findElement(By.xpath("//a[@id='controlled-tab-tab-/login']")).click();
		driver.findElement(By.xpath("//input[@id='emailOrUsername']")).sendKeys("ahsan.g@plumlogix.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ayubsabir123");
		driver.findElement(By.xpath("//button[@id='sign-in']")).click();
//		System.out.println(prop.getProperty("searchPlaceholder"));//just for checking which value it is taking 
//		System.out.println("***************$$$$$$$$$$*****************");
		
//		Assert.assertTrue(homePage.isPlaceholderExist(prop.getProperty("searchPlaceholder")));
		
		
	}
	//0.4 A test to assert that contact element exists on the UI of un.org/fr website
//	@Test(priority=2)
//	public void checkContactExist() {
//		System.out.println("**********$$$$$$$$$$$$**********************");
//		System.out.println(prop.getProperty("contactUs"));//just for checking which value it is taking 
//		System.out.println("***************$$$$$$$$$$*****************");
//		Assert.assertTrue(homePage.isContactExist(prop.getProperty("contactUs")));//1. Assert to make sure that contact exist on the UI, this will send the value of contact from properties to the method isContactExist
//		
//	
//		
//	}	
	
	@AfterTest
	public void teardown() {
		
//		driver.quit();
	}

}
