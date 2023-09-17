package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;    // no scope driver

	private By username=By.xpath("//input[@name='username']");
	
	private By password=By.xpath("//input[@name='password']");

	
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement enterUsername() {
		
	return driver.findElement(username);
				
		
	}

	public WebElement enterPssword() {
		
	return driver.findElement(password);
	}
	
	
}
