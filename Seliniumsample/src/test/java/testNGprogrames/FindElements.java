package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FindElements {
	WebDriver driver;
  @Test
  public void inputForm() {
	  WebElement inputForm=driver.findElement(By.className("(//a[@class='nav-link'])[2]"));
		inputForm.click();
  }
  @Test
  public void checkBoxDemo() {
	  WebElement checkBoxdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxdemo.click();  
  }
  @Test
  public void checkBoxesListing() {
	  WebElement checkBoxdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxdemo.click();
		List<WebElement>checkboxes=driver.findElements(By.className("check-box-list"));
		for(WebElement element:checkboxes)
		{
			element.click();
			
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	   driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in");
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
	  //driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Find elements");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Find elements after suite");
  }

}
