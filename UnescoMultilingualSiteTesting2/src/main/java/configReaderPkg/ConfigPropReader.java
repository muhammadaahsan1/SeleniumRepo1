package configReaderPkg;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {
	
	
	private Properties prop; //[Properties Class Reference being made here]
	private FileInputStream ip;
	
	



public Properties initializeLangProp(String language) //I will write the return as properties as the return of this method is properties

{
	
	System.out.println("The selected language is: " + language);
	
	prop = new Properties();  // initializing prop object with properties object
	
	//switch case to switch as per the case, the key value received in switch is language in lower case
	
	try {
	
	switch(language.toLowerCase()) {
	case "english":
		ip = new FileInputStream("C:\\Users\\Syes Ahsan\\eclipse-workspace\\UnescoMultilingualSiteTesting2\\src\\main\\resources\\lang.english.properties"); //A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
		break;
	case "espanol":
		ip = new FileInputStream("C:\\Users\\Syes Ahsan\\eclipse-workspace\\UnescoMultilingualSiteTesting2\\src\\main\\resources\\lang.espanol.properties");
		break;
		
	default: 
		System.out.println("The language is not found" + language);
		break;

	}
	
	prop.load(ip); // to load the properties of ip
	
	}
	catch(Exception e){
		
	}
	return prop;
	
	
}
 
}
