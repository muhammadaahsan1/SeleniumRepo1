package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtil;



public class HomePage {
	
	private WebDriver driver; //access level of this declared variable (driver) is private to this class, however later we will assign the value of driver coming from DriverFactory class
	private ElementUtil elementUtil; // maintaining a class (ElementUtil class imported here) instance as private
	
	public HomePage(WebDriver driver) //to maintain the same driver across various classes, this driver passed in this constructor will be coming from other test classe file(s)
	
	{
		
		this.driver=driver;
		elementUtil=new ElementUtil(driver); //initializing ElementUtil class's object here, Inside ElementUtil Class I have created a constructor to pass the same driver, its a skill to pass driver from one page to another page using constructor
	}
	
	private WebElement getHeaderElement(String headerValue) //kept this private as here we are just getting the WebElement, the test client doesn't need this rather it needs the value or whether it exist or not which is done in further method isHeaderExist() which hence is kept public
	{	String headerXpathValue = "//a[contains(text(),'"+headerValue+"')]";
		return elementUtil.getElement("xpath", headerXpathValue); 	}
	
	public boolean isHeaderExist(String headerValue) //Here encapsulation is utilized, if you see we are hiding above the method (getHeaderElement) i.e. keeping it private i.e. direct access to above method is not allowed rather this current public method can be accessed to get the value by calling above method
	{	String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		return getHeaderElement(headerValue).isDisplayed();	}
	//5. here this method is called by the method below and provided with contactValue to create xpath/css/name/id and provide this xpath/css/name/id to further getElementMethod of ElementUtil Class
	private WebElement getContactElement(String contactValue) //kept this private as here we are just getting the WebElement, the test client doesn't need this rather it needs the value or whether it exist or not which is done in further method isHeaderExist() which hence is kept public
	{
		String contactXpathValue = "//a[contains(text(),'"+contactValue+"')]";
		return elementUtil.getElement("xpath", contactXpathValue); 	}
	//2. isContactExist method is provided with contactValue from HomePageTest.java file
	public boolean isContactExist(String contactValue) //Here encapsulation is utilized, if you see we are hiding above the method (getHeaderElement) i.e. keeping it private i.e. direct access to above method is not allowed rather this current public method can be accessed to get the value by calling above method
	{	//the contact value is provided from HomePageTest.java file
		
		//3. To get the text against a certain xpath, getText() is called
		String contact = getContactElement(contactValue).getText(); //this (contact) will give contactValue in capital as getText() returns in caps, so it can't be used while calling getContactElement() rather contactValue should be used 
		System.out.println(contact);
		//4. This will make sure that whether webelement having a certain contact value, is found on page, if so true otherwise false
		return getContactElement(contactValue).isDisplayed(); }
		
		
	
	
	

}
