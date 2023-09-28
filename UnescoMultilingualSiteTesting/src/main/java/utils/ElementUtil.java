package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	//The purpose of this class is to have some utilities to help in creating WebElements, creating the by locators 
	
	private WebDriver driver; //Initializing WebDriver, ElementUtil has its own WebDriver 
	
	public ElementUtil(WebDriver driver) //A constructor(an instance of the class) method of the class, it accepts input arguments to assign data stored in properties 
	{
		//this constructor method accepts driver as input argument to assign it to the driver of this class declared above i.e.private WebDriver driver
		
		this.driver = driver;		
	}
	
	public WebElement getElement(By locator)  //this method says that provide me with By locator and I will return an WebElement based on the locator
	{ 
		return driver.findElement(locator);
	}
	
	//overload the above method again, and asking for locatorType (i.e. xpath, css...) and locatorValue (xpath value, css value)
	public WebElement getElement(String locatorType, String locatorValue ) //
	{
		return driver.findElement(getBy(locatorType, locatorValue));  //as we need a by locator here, for that I will create a method/utility below having same two parameters as input 
		//the above line will return a WebElement that will then be fed to getElement method above
	}
	
	public By getBy(String locatorType, String locatorValue) {
		//using above 2 parameters we will find By locators
		
		//initially we will have a By locator pointing to null
		By locator = null;
		
		switch(locatorType.toLowerCase())
		{
		
		case "id":
			locator = By.id(locatorValue);
			break;
		
		case "name":
			locator=By.name(locatorValue);
			break;
		case "xpath":
			locator=By.xpath(locatorValue);
			break;
		case "css":
			locator=By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator=By.linkText(locatorValue);
			break;
		
		
		}
		
		return locator;
	}
	
	

}
