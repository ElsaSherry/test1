package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment1c {
	public WebDriver driver;
	 @Test
	    public void testHandleAlerts() throws InterruptedException {
	        
	        WebElement alertBoxButton = driver.findElement(By.id("alertBox"));
	        alertBoxButton.click();
	        Thread.sleep(2000); // Wait for the alert to appear
	        driver.switchTo().alert().accept();
	        System.out.println("Handled alert box");
	        
	        
	        WebElement confirmBoxButton = driver.findElement(By.id("confirmBox"));
	        confirmBoxButton.click();
	        Thread.sleep(2000); // Wait for the alert to appear
	        driver.switchTo().alert().dismiss();
	        System.out.println("Handled confirm box");

	        
	        WebElement promptBoxButton = driver.findElement(By.id("promptBox"));
	        promptBoxButton.click();
	        Thread.sleep(2000); // Wait for the alert to appear
	        driver.switchTo().alert().sendKeys("Test input");
	        driver.switchTo().alert().accept();
	        System.out.println("Handled prompt box with input");
	    }
  
  @BeforeClass
  public void beforeClass() {
	   driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html?m=1");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
