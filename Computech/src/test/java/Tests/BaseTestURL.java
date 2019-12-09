package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class BaseTestURL {
	
	public static WebDriver driver;
	
	
	
	
	public static String url = "http://computechis.com/DemoSite";
  @Test
  public void login () {
  }
  @BeforeSuite
  public void initialization() {
	  
	  
	  	driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterSuite
  public void teardown() {
	  
	  //BaseTestURL.driver.quit();
	  
  }

}
