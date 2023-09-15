package com.Ahsan1.TestingNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Login {
	
	WebDriver driver = new FirefoxDriver();
	
	  @BeforeMethod
	  public void startFireFox() {
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	  
	    driver.get("http://www.freecrm.com/");
//	    login("ahsan.g@plumlogix.com","Plumlogix123");
	    
	    
	  }

	  
	  @Test(priority=1, invocationCount=5)
	  public void verifyPageTitleTest(){
	  String title= driver.getTitle();
	  System.out.println("the page title is: "+ title);
//	  Assert.assertEquals(title, "#1 Free C7RM Power Up your Entire Business Free Forever");
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(title, "#1 Free C7RM Power Up your Entire Business Free Forever");
	  System.out.println("Successful Run");  //this will not run in case of hard assertion (if uncommented above)
	  //Softassertion will not fail the test and will proceed with further steps
	  }
  
  
  
	  @Test(priority=2)
	  public void verifyFreeCRMLogoTest(){
	
	  boolean flag = driver.findElement(By.xpath("//img[@alt='free crm twitter']")).isDisplayed(); 
	  Assert.assertTrue(flag);
	
	  }
	  
	  @Test(priority=3, enabled=false)
	  public void verifyFree1CRMLogoTest(){
	
	  boolean flag = driver.findElement(By.xpath("//img[@alt='free crm twitter']")).isDisplayed(); 
	  Assert.assertTrue(flag);
	  System.out.println("will not execute as enabled = false");
	
	  }
  
  
 

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	  public void login(String username, String password){ 
		  
		  driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		  driver.findElement(By.name("email")).sendKeys(username); driver.findElement(By.name("password")).sendKeys(password);
		  //login button:
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

}

}
