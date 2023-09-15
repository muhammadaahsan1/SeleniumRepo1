package com.Ahsan1.TestingNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeMainPage {
	WebDriver driver = new FirefoxDriver();
	
	  @BeforeMethod(alwaysRun=true)
	  public void startFireFox() {
	    driver.manage().window().maximize();
	    driver.get("https://www.orangehrm.com");
	    
	    
	   
	  }
//The timeOut attribute in TestNG is used to determine the maximum time permitted for a test method to execute.
	  @Test(priority=1, timeOut=10000)
	  public void bookAFreeDemo(){

	  WebElement book = driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));

	  book.click();
	  System.out.print("\n'SUCCESSFUL EXECUTION!!!");
	  }
	  
	  
	  @Test(priority=2)
	  public void clickOnSales(){
	  WebElement sales = driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]//a[1]"));
	  sales.click();

	  }



	  @AfterMethod(alwaysRun = true)
	  public void tearDown() {
		  
		  if (driver == null) {
		        driver.quit();
		    }




		 
	  }	
	  
	  
	 
	  
}
