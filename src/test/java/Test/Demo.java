package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo 
{
	
	@BeforeTest
	public void m()
	{
		
		
		   // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "chrome/chromedriver"); 
	    
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	    System.out.println("hello");
	}

}
