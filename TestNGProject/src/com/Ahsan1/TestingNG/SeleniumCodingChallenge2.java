package com.Ahsan1.TestingNG;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SeleniumCodingChallenge2 {
	static WebDriver driver = new FirefoxDriver();
	
	
    static final String NEXT_BUTTON = "//div[contains(@class, 'swiper-button-next custom-navigation swiper-nav')]";

    public static void main(String[] args) throws InterruptedException {

        String sec_RecommendedForYou = "//h2[normalize-space()='Recommended for you']";
        String sec_TopPicks = "//h2[normalize-space()='Trending deals in electronics']";
        //*** Hardcoded the New arrivals section xpath ***//
        String sec_NewArrivals = "//div[7]//h3[normalize-space()='New arrivals']";
        String sec_SaveBigOnMobile = "//h3[contains(text(),'Save big on mobiles')]";

        
        driver.get("https://www.noon.com/uae-en/");
        driver.manage().window().maximize();
        
        /*To get all product names, getAllProductNames methods is written below
         * Using this same method, product names from different carousels i.e. Recommended For you, Top picks, New Arrivals,
         * and SaveBigOnMobile have been called
        */

        System.out.println("Section : Recommended For You");
        getAllProductNames(sec_RecommendedForYou).forEach(System.out::println);  //This section Name's xpath is being passed to getAllProductNames method and then to select section and then to getProductNames 
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Section : Top picks in electronics");
        getAllProductNames(sec_TopPicks).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Section : New arrivals");
        getAllProductNames(sec_NewArrivals).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Section : Save big on mobiles & tablets");
        getAllProductNames(sec_SaveBigOnMobile).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------");

        driver.quit();
    }

    //here sectionName has the section name's xpath
    public static void selectSection(String sectionName) throws InterruptedException {

        Actions action = new Actions(driver);  //Actions class is an ability provided by Selenium for handling keyboard and mouse events
        JavascriptExecutor executor = (JavascriptExecutor) driver; //JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. e.g. scroll into view command, to generate alert window, to navigate to new url, performing a sleep in the browser under test, click on a certain element where selenium fails

        do //this do while loop will keep running as long as the condition at the last is true, it will only break when we will find the element in the try part
        {
            try {
                WebElement ele_Section = driver.findElement(By.xpath(sectionName));
                //The below command will scroll until the element is in view:
                executor.executeScript("arguments[0].scrollIntoView(true);", ele_Section); // The executeScript() method from the JavascriptExecutor Interface can invoke multiple arguments in the form of arguments[0], arguments[1], etc
                break;  
            } catch (NoSuchElementException e) //if this exception is thrown for the current view, it keeps pressing page down key until we found the ele_Section element
            {
                action.sendKeys(Keys.PAGE_DOWN).perform();
                Thread.sleep(1000);
            }
        }
        while (true);
    }

    public static List<String> getProductNames(String sectionName) throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //creating a list from an array
        List<String> itemsToAdd = new ArrayList<>();

        do {
            List<WebElement> allItems = driver.findElements(By.xpath(sectionName + "/../../..//div[@data-qa='product-name']/div"));
            allItems.stream().filter(WebElement::isDisplayed).forEach(element -> itemsToAdd.add(element.getText()));
            if (driver.findElement(By.xpath(sectionName + "/../../.." + NEXT_BUTTON)).getAttribute("class").contains("disabled")) {
                break;
            }
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(sectionName + "/../../.." + NEXT_BUTTON)));
            Thread.sleep(1000);
        }
        while (true);
        System.out.println("Total items : " + itemsToAdd.stream().distinct().count());
        return itemsToAdd.stream().distinct().sorted().collect(Collectors.toList());
    }

    public static List<String> getAllProductNames(String sectionName) throws InterruptedException {

        selectSection(sectionName);
        return getProductNames(sectionName);
    }

}




