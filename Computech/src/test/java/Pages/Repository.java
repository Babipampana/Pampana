package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.BaseTestURL;
import Tests.Data;
import Tests.Login;
import Tests.Logout;

public class Repository {
	
	public static WebDriver driver;
	
 
	@Test
	
	public void login() throws Exception {
		
		driver.findElement(Login.user).sendKeys(Data.user);
		driver.findElement(Login.pass).sendKeys(Data.pass);
		driver.findElement(Login.log).click();
		
		Thread.sleep(5000);
		
		driver.findElement(Logout.Out).click();
		
		
	}
	
	  @BeforeTest
	  public void initialization() {
		  
	  //driver.get(BaseTestURL.url);
	  
		 	driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(BaseTestURL.url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	  }

		


}
