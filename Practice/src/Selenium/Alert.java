package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Alert {
	
	public WebDriver driver;
	//private String baseUrl;
	
  @Test (priority = 1)
  public void Login() {
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Adminn");
	  driver.findElement(By.name("submit")).click();
  }
  
  @Test (priority = 2)
  public void alert() throws Exception {
	  
	  String Ale = driver.switchTo().alert().getText();
	  
	  System.out.println(Ale);
	  
	  Thread.sleep(5000);
	  
	  driver.switchTo().alert().accept();
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  //baseUrl = "http://www.computechis.com/DemoSite";
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
