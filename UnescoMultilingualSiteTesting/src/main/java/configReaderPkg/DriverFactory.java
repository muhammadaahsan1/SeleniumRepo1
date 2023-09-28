package configReaderPkg;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public WebDriver driver;
	
	public WebDriver initializeDriver(String browser, Properties prop) //as return type is WebDriver
	
	{
		
		System.out.println("Current browser is: "+ browser);
		
		
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver();
			break;
			
		default:
			System.out.println("you have entered an incorrect browser or the one not in our systsem: "+ browser);
			break;
			
		}
		
		driver.get(prop.getProperty("url")); //getProperty method is used to obtain value against the key url in properties file being inputted in this method
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
		
		
		
	}

}
