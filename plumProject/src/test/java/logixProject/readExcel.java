package logixProject;

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

public class readExcel {
WebDriver driver;
	public static void main (String [] args) throws IOException{
        //I have placed an excel file 'Test.xlsx' in my D Driver 
		//Why using Input Stream in file handling
		System.setProperty("webDriver.gecko.driver", "C:\\Users\\Syes Ahsan\\eclipse-workspace\\plumProject\\Resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
		
		

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		       	System.out.println(cell);
		String cellA = sheet.getRow(0).getCell(1).getStringCellValue();
		Cell cellB = sheet.getRow(0).getCell(1);
		Cell cellC = sheet.getRow(1).getCell(0);
		Cell cellD = sheet.getRow(1).getCell(1);
		       	
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println("------------");
		System.out.println(cellA);
		driver.get("https://www.google.com");
//		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.name("q")).sendKeys(cellA);
		driver.get("https://www.plumlogix.com");
		driver.findElement(By.linkText("Contact Us")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        
        driver.switchTo().frame(driver.findElement(By.id("hs-form-iframe-0")));
		
		
		
		driver.findElement(By.name("email")).sendKeys(cellA);
		driver.findElement(By.name("phone")).sendKeys(cellA);
		driver.findElement(By.name("email")).sendKeys(cellA);
		driver.findElement(By.name("phone")).sendKeys(cellA);
		driver.findElement(By.name("email")).sendKeys(cellA);
				
		
		
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);

	}
	}
