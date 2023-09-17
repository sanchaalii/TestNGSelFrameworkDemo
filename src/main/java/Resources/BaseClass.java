package Resources;

//HANDLE MULTIPLE BROWSER 


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class BaseClass {
	public WebDriver driver;

	public void initializeDriver() throws IOException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\shri\\eclipse-workspace\\TestNGSelFrameworkDemo\\src\\main\\java\\Resources\\data.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			 driver=new FirefoxDriver();
			
			
		}
		
		else if (browserName.equalsIgnoreCase("Edge")) {
			
			 driver=new EdgeDriver();
			
			}
		
		else {
			
		System.out.println("Please Choose Valid Browser");
		
		}
			
		}
		
		
	}
	

