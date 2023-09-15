package com.Ahsan1.TestingNG;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.utility.TestUtil;

public class EbayTest {
	
	WebDriver driver = new FirefoxDriver();
	
	  @BeforeMethod
	  public void startFireFox() {
	  driver.manage().window().maximize();
	 
      driver.get("https://www.website.com/case-tracker/new-case/?source=SC"); // enter url
    
	  }
	  @DataProvider  //providing data from excel file inside the TestUtil file
	   public Iterator<Object[]> getTestData(){
	    ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
	    return testData.iterator();

	    }
	    
	    @Test(dataProvider="getTestData")
	    public void ebayRegPageTest(String firstName, String lastName, String address1, String address2, String city, String state, String zipCode, String emailAddress){
	    //enter data:
	    driver.findElement(By.xpath("//*[@name='SenderName']")).clear();
	    driver.findElement(By.xpath("//*[@name='SenderName']")).sendKeys(firstName);
	    driver.findElement(By.xpath("//*[@name='Subject']")).clear();
	    driver.findElement(By.xpath("//*[@name='Subject']")).sendKeys(lastName);
	    driver.findElement(By.xpath("//*[@name='UserID']")).clear();
	    driver.findElement(By.xpath("//*[@name='UserID']")).sendKeys(address1);
	    driver.findElement(By.xpath("//*[@name='Password']")).clear();
	    driver.findElement(By.xpath("//*[@name='Password']")).sendKeys(address2);
	    driver.findElement(By.xpath("//*[@name='Message']")).clear();
	    
	    driver.findElement(By.xpath("//*[@name='Message']")).sendKeys(city);
//	    Select select = new Select(driver.findElement(By.xpath("//*[@id='state']"))); select.selectByVisibleText(state);
//	    driver.findElement(By.xpath("//*[@id='zip']")).clear(); driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);
	    driver.findElement(By.xpath("//*[@name='DomainName']")).clear();
	    driver.findElement(By.xpath("//*[@name='DomainName']")).sendKeys(emailAddress);
	    
	    
	    }


  @AfterMethod
  public void afterMethod() {
  }

}
