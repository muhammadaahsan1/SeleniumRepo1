
package com.Ahsan1.TestingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestDataDrivenTesting {
	WebDriver driver = new FirefoxDriver();
	
	  
	  
	
	@Test(dataProvider = "dp1", dataProviderClass=DataSupplier1DArray.class)
	public void TestLogin(String s) throws Exception {
	     System.out.println(s);
	}
	
	@Test(dataProvider="LoginDataProvider", dataProviderClass=DataSupplier2DArray.class)
	
	public void TestLogin(String name, String subject){

		
		
	    driver.manage().window().maximize();

	    driver.get("https://www.website.com/case-tracker/new-case/?source=SC");
	    
	    
	    driver.findElement(By.xpath("//*[@name='SenderName']")).sendKeys(name);
//	    driver.findElement(By.xpath("//*[@name='Subject']")).clear();
	    driver.findElement(By.xpath("//*[@name='Subject']")).sendKeys(subject);
//	    driver.findElement(By.xpath("//*[@name='SenderName']")).clear();
	    

	    

	    
	    
//	    driver.close();
	    }



	};


