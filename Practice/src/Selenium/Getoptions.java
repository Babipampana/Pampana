package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Getoptions {
	
	public WebDriver driver;
	
	String arr[]= {"All Categories",
			"Antiques","Art","Baby",
			"Books","Business & Industrial",
			"Cameras & Photo",
			"Cell Phones & Accessories",
			"Clothing, Shoes & Accessories",
			"Coins & Paper Money","Collectibles",
			"Computers/Tablets & Networking",
			"Consumer Electronics","Crafts",
			"Dolls & Bears","DVDs & Movies","eBay Motors",
			"Entertainment Memorabilia","Gift Cards & Coupons",
			"Health & Beauty","Home & Garden","Jewelry & Watches",
			"Music","Musical Instruments & Gear","Pet Supplies",
			"Pottery & Glass","Real Estate","Specialty Services",
			"Sporting Goods","Sports Mem, Cards & Fan Shop","Stamps",
			"Tickets & Experiences",
			"Toys & Hobbies",
			"Travel","Video Games & Consoles",
			"Everything Else"};
			
	
  @Test (priority = 1)
  public void Go() {
	  
	   
	  List<WebElement> list = new Select(driver.findElement(By.id("gh-cat"))).getOptions();
	  
	  System.out.println(list.get(2).getText());
	  
	  for (int i = 0; i < list.size(); i++) {
		  
		  System.out.println(list.get(i).getText());
		
	}
	  
	  
  }
  
@Test (priority = 2)
  
  public void validation() {
	  
	List<WebElement> webelem=new Select(driver.findElement(By.id("gh-cat"))).getOptions();
	
	for (int i = 0; i < webelem.size(); i++) 
	{
		Assert.assertEquals(arr[i],webelem.get(i).getText());
		
	}
	System.out.println("verified");

  }
  @BeforeTest
  public void Openurl() throws Exception {
	  
	  
	  driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://in.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
