package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;

public class LoginTestCases extends BaseClass {
	
	@Test
	public void VerifyValidLogin() throws IOException, InterruptedException {
		
		initializeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
	LoginPageObjects lpo =new LoginPageObjects(driver);  //object created from pageobject class
	
		
		lpo.enterUsername().sendKeys("Admin"); //called by method
		
		lpo.enterPssword().sendKeys("admin123");
		

	}

}
