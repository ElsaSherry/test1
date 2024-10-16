package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionExample {
	public WebDriver driver;
  @Test
  public void verifyTheExact_url_openswhileHittingIt()
  {
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="https://selenium.qabible.in/simple-form-demo.php";
	  Assert.assertEquals(actualURL, expectedURL,"the URL is not correct");
  }
  @Test
  public void verifyInputFormURL() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  WebElement setMessage=driver.findElement(By.id("single-input-field"));
	  String expectedMessage=setMessage.getText();
	  setMessage.sendKeys("our message");
	  WebElement getMessage=driver.findElement(By.id("button-one"));
	  getMessage.click();
	  String actualMessage="Your Message : TestMessage";;
	  Assert.assertEquals(actualMessage, expectedMessage,"not the message");
	  
	  
  }
  
  @Test
  public void verifyMessageOnClickingShowMessageButton() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  WebElement txtMessage = driver.findElement(By.id("single-input-field"));
	  txtMessage.sendKeys("TestMessage");
	  driver.findElement(By.id("button-one")).click();
	  String actualMessage = driver.findElement(By.id("message-one")).getText();
	  //String expectedResult = "Your Message : TestMessage";
	  //Assert.assertEquals(actualMessage, expectedResult);
	  Assert.assertTrue(actualMessage.contains("TestMessage"));
  }
	  

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
}
  

  @AfterTest
  public void afterTest() {
  }

}
