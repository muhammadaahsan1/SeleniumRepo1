package com.test.utility;

import java.util.ArrayList;
import com.excel.utility.Xls_Reader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestUtil {
	static Xls_Reader reader;
	
//	we used static below so we can use it directly by class name
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
		reader = new Xls_Reader("C:\\Users\\Syes Ahsan\\eclipse-workspace\\testData.xlsx");
		} catch (Exception e) {
		e.printStackTrace();
		}

		for (int rowNum = 2; rowNum<=reader.getRowCount("testDataSheet"); rowNum++) {

		String firstName = reader.getCellData("testDataSheet", "firstname", rowNum); 
		String lastName = reader.getCellData("testDataSheet", "lastname", rowNum); 
		String address1 = reader.getCellData("testDataSheet", "address", rowNum); 
		String address2 = reader.getCellData("testDataSheet", "address2", rowNum); 
		String city = reader.getCellData("testDataSheet", "city", rowNum); 
		String state = reader.getCellData("testDataSheet", "state", rowNum);
		String zipCode=  reader.getCellData("testDataSheet", "zipcode", rowNum);
		String emailAddress=  reader.getCellData("testDataSheet", "emailaddress", rowNum);
		Object ob[]={firstName, lastName, address1, address2, city, state, zipCode, emailAddress}; 
		myData.add(ob);
		}
		
	return myData;
		
	}

}
