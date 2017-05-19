package Git;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Github {

	public void getProperties(){
		
		Set<String> properties = new TreeSet<String>(System.getProperties().stringPropertyNames());
		
		Iterator<String> item = properties.iterator();
		while (item.hasNext()) {
			String st = item.next();
			System.out.printf("The property is %s: %s : %n ",st , System.getProperty(st));
			
		}	
	}
		

		public void setupserver(){
			System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 ChromeOptions opt = new ChromeOptions();
			opt.addArguments("disable-infobars");
			opt.addArguments("diable-notification");
			driver.get("http://www.google.com");	
			driver.manage().window().maximize();
			//JavaScriptExecutor sc = new JavaScriptExecutor(driver);	// TODO Auto-generated method stub
				System.out.println("we are there");
				System.exit(0);
		}
		
		}	
			
		
	

