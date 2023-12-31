package testPackage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReaderPkg.ConfigPropReader;
import driverFactory.DriverFactory;
import pages.HomePage;


//To understand the project follow steps from 0.1 to 0.4 and 1 to 7

public class HomePageTest {
	
	//0.0 to call methods in classes I created earlier, I have maintained the class's reference here
	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;   //properties is an in-built method of Java, Properties is a subclass of Hashtable. It is used to maintain a list of values in which the key is a string and the value is also a string i.e; it can be used to store and retrieve string type data from the properties file. Properties class can specify other properties list as it's the default.
	WebDriver driver;  //creating WebDriver instance here for the test class and later will store the result coming from initializeDriver method of DriverFactory Class
	HomePage homePage; 
	
	
	//0.1 setting up setup and teardown methods under BeforeTest and AfterTest annotations respectively
	@BeforeTest
	public void setup() {
		
		//0.3 Inside Before Test; creating objects of classes 1st to call methods inside them
		cp = new ConfigPropReader();
		prop = cp.initializeLangProp("english");//change the language here for the site
		df = new DriverFactory();
		driver = df.initializeDriver("firefox", prop);
		homePage = new HomePage(driver);
		
		
	}
	
	@Test
	public void checkPlaceholderExist() {
		
		System.out.println("**********$$$$$$$$$$$$**********************");
		System.out.println(prop.getProperty("searchPlaceholder"));//just for checking which value it is taking 
		System.out.println("***************$$$$$$$$$$*****************");
		
		Assert.assertTrue(homePage.isPlaceholderExist(prop.getProperty("searchPlaceholder")));
		
		
	}
	//0.4 A test to assert that contact element exists on the UI of un.org/fr website
	@Test
	public void checkContactExist() {
		System.out.println("**********$$$$$$$$$$$$**********************");
		System.out.println(prop.getProperty("contactUs"));//just for checking which value it is taking 
		System.out.println("***************$$$$$$$$$$*****************");
		Assert.assertTrue(homePage.isContactExist(prop.getProperty("contactUs")));//1. Assert to make sure that contact exist on the UI, this will send the value of contact from properties to the method isContactExist
		
	
		
	}	
	
	@AfterTest
	public void teardown() {
		
//		driver.quit();
	}
	
	
	

}
