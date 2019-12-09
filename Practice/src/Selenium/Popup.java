package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Popup {
	public WebDriver driver;
	
  @Test(priority = 1)
  public void Login() throws Exception {
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  
	  
  }
  @Test(priority = 2)
  public void Pop() throws Exception {
	  
	  driver.findElement(By.linkText("Feedback")).click();
	  Thread.sleep(2000);
	  
	  String parent = driver.getWindowHandle();
	  
	  for(String child : driver.getWindowHandles()){
	      driver.switchTo().window(child);
	  }
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@id='name']")).click();
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sample");
	  driver.findElement(By.id("email")).click();
	  driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
	  new Select(driver.findElement(By.xpath("//select[@id='car']"))).selectByVisibleText("Audi");
	  driver.findElement(By.xpath("//label[contains(text(),'Pick one')]//input[@name='radio']")).click();
	  //CheckBox
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\Bobby\\Cetificates\\Passport photo 120 kb.jpg");
	  driver.findElement(By.id("message")).sendKeys("Hi this is...");
	  driver.findElement(By.xpath("//button[@class='action']")).click();
	  
	  //Screenshot
	  Robot b = new Robot();
	  Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	  BufferedImage image = b.createScreenCapture(capture);
	  ImageIO.write(image, "png", new File("E:\\shot.png"));
	  System.out.println("The shot is taken");
	  
	  
	  
	  
	  
	  driver.findElement(By.id("close")).click();
  
	  driver.switchTo().window(parent);
	 
  }
  
  @Test(priority = 3)
  
  public void Logout() throws Exception {
	  
	  driver.findElement(By.linkText("Logout")).click();
	  Thread.sleep(3000);
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
