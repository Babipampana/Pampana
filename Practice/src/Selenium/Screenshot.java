package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Screenshot {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  
	  List<WebElement> list = new Select(driver.findElement(By.id("gh-cat"))).getOptions();
	  
	  System.out.println(list.get(2).getText());
	  
	  for (int i = 0; i < list.size(); i++) {
		  
		  System.out.println(list.get(i).getText());
		
	}
	  
	  Robot b = new Robot();
	  Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	  BufferedImage image = b.createScreenCapture(capture);
	  ImageIO.write(image, "png", new File("E:\\shot.png"));
	  System.out.println("The shot is taken");
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://in.ebay.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(4000);
	  
	  /*TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source, new File ("E:\\screenshot2.jpg"));
	  System.out.println("the Screenshot is taken");
	  */
	  Robot r = new Robot();
	  Rectangle capture= new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	  BufferedImage image = r.createScreenCapture(capture);
	  ImageIO.write(image, "jpg", new File("E:\\screen.png") );
	  System.out.println("the Screenshot is taken");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
