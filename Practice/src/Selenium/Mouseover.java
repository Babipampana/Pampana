package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mouseover {
	
	public WebDriver driver;
	
	public Actions Action;
  @Test
  public void Mouse() throws Exception {
	  
	  Action = new Actions(driver);
	  
	  WebElement fashion = driver.findElement(By.linkText("Fashion"));
	  Action.moveToElement(fashion).build().perform();
	  
	  Thread.sleep(2000);
	  

	    }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
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
