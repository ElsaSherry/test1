package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotationchecking {
	public WebDriver driver;
  @Test
  public void getAttribute() {
	 
	WebElement message = driver.findElement(By.id("single-input-field"));
		String s = message.getAttribute("placeholder");
		System.out.println(s); 
  }
  @Test
  public void getTagName() {
	  WebElement message = driver.findElement(By.id("single-input-field"));
		
		System.out.println(message.getTagName());
  }
  @Test
  public void getLocation() {
	  WebElement message = driver.findElement(By.id("single-input-field"));
	  Point p=message.getLocation();
		System.out.println(p);
		
		
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Checking1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Checking 1 Handling");
	  
  }

}
