package testNGprogrames;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class WaitsinSelenium {
	public WebDriver driver;
	WebDriver wait;
  @Test
  public void verifyExplicitwait() {
	  WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	  WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait1.until(ExpectedConditions.elementToBeClickable(input));
  }
  @Test
  public void verifyFluventwait() {
	  WebElement input1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	  Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(input1));
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
