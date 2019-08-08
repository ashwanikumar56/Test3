package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Demo 
{
	
	@BeforeTest
	public void m()
	{
		
		
		   // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver"); 
	    
 
	    ChromeOptions options = new ChromeOptions();
	    
	    options.addArguments("--headless");
	    options.addArguments("start-maximized"); // open Browser in maximized mode
	    options.addArguments("disable-infobars"); // disabling infobars
	    options.addArguments("--disable-extensions"); // disabling extensions
	    options.addArguments("--disable-gpu"); // applicable to windows os only
	    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	    options.addArguments("--no-sandbox"); // Bypass OS security modelop
	    System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
	    options.setBinary("chrome/chromedriver");
	    
	    WebDriver driver=new ChromeDriver();
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	    System.out.println("hello");
	}

}
