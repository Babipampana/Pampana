package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Datadriven {
	
	public WebDriver driver;
  @Test
  public void Login() throws Exception {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\Pampana\\OneDrive\\Desktop\\Gmail.xlsx");
	  
	  driver.findElement(By.id("identifierId")).sendKeys("pampana.babi@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pampana19*&");
	  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
  }
  @BeforeTest
  public void Openurl() throws Exception {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.gmail.com");
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
