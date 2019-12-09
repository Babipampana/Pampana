package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Infocmd {
	
	public WebDriver driver;
  @Test (priority = 1)
  public void gtext() {
	  
	  String Log = driver.findElement(By.xpath("//a[@id='gh-la']")).getText();
	  
	  System.out.println(Log);
  }
  
  @Test (priority = 2)
  public void gatt()
  {
	  String Log1 = driver.findElement(By.xpath("//a[@id='gh-la']")).getAttribute("id");
	  System.out.println(Log1);
	  
  }
  @BeforeTest
  public void Openurl() throws Exception {
	  
	  driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://in.ebay.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
  }

}
