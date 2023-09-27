package challenges;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBrokenLink {
	
	//This class helps to find broken links on any website in less than 20 seconds for 250 broken links
	
	 static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Syes Ahsan\\eclipse-workspace\\plumProject\\Resources\\geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println(links);
		System.out.println(links.size());
		
        //Create an ArrayList object to store url links

		List<String> linkList = new ArrayList<>();
		
		for(WebElement e : links)  //checks WebElement in links list i.e. iterate through the list that we have captured
			
		{
			
			String url = e.getAttribute("href");
			linkList.add(url);
//			System.out.println(linksList);
			
		}
		
		
		long startTime = System.currentTimeMillis();
		
		//Sequential Stream: Runs on a single-core of the computer, slower execution, to use uncomment the line below

//		linkList.stream().forEach(e->checkBrokenLink(e));
		//Parallel Streams. Any stream in Java can easily be transformed from sequential to parallel. Parallel streams enable us to execute code in parallel on separate cores.
		//Parallel streams enable us to execute code in parallel on separate cores. The final result is the combination of each individual outcome.
		linkList.parallelStream().forEach(e-> checkBrokenLink(e));  //e is representing linklist
		long endTime = System.currentTimeMillis();
		
		long timeTakenToFindBrokenLinks = endTime - startTime;
		System.err.println("Time Taken to find Broken links on this site is: "+ timeTakenToFindBrokenLinks + "milliseconds");
		
		driver.quit();

}

	//checkBrokenLink Method taking an input of each URL coming from the main method 
	private static void checkBrokenLink(String linkURL) {
		// TODO Auto-generated method stub
		
		try {
			
			URL url = new URL(linkURL); //object in Java that represents an absolute URL
			
			HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();  //OpenConnection method of url returns a URLConnection instance that represents a connection to the remote object reffered to by the URL, along with openConnection method, HttpURLConnector class helps to get information about HTTP URL incl. header information, response code, status code
			httpUrlConnection.setConnectTimeout(5000); //Sets a specified timeout value, in milliseconds, to be used when opening a communications link to the resource referenced by this URLConnection. If the timeout expires before the connection can be established, a java.net.SocketTimeoutException is raised. A timeout of zero is interpreted as an infinite timeout.
			httpUrlConnection.connect(); //establish the actual network connection
			
			
			
			if(httpUrlConnection.getResponseCode()>=400) {
			//if the response is greater than 400 means bad server response, i.e. broken link found	
				System.out.println(linkURL + " -------------> " + httpUrlConnection.getResponseMessage()+ ", is a broken link");
			}
			
			else {
				System.out.println(linkURL + " -------------> " + httpUrlConnection.getResponseMessage() );
			}
		}
		
		catch (Exception e){
			
		}
		
		
	}
}
