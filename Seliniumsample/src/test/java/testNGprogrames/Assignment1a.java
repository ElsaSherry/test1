package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment1a {
	 public WebDriver driver;
  @Test
  public void testFormSubmission() { 
      
      WebElement inputFormLink = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
      inputFormLink.click();

      
      WebElement formSubmitLink = driver.findElement(By.xpath("//a[@href='form-submit.php']"));
      formSubmitLink.click();

      
      driver.findElement(By.id("validationCustom01")).sendKeys("Elsa");
      driver.findElement(By.id("validationCustom02")).sendKeys("Sherry");
      driver.findElement(By.id("validationCustomUsername")).sendKeys("elsasherry");
      driver.findElement(By.id("validationCustom03")).sendKeys("Triruvananthapuram");
      driver.findElement(By.id("validationCustom04")).sendKeys("Kerala");
      driver.findElement(By.id("validationCustom05")).sendKeys("695011");


    
      WebElement checkbox = driver.findElement(By.id("invalidCheck"));
      if (!checkbox.isSelected()) {
          checkbox.click();
      }

      
      WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
      submitButton.click();

      // Print the message in the console
      System.out.println("Form has been submitted successfully!");
  }
  @BeforeClass
  public void beforeClass() 
	  
	  {
		   driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.manage().window().maximize();
		
	  }
  

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
