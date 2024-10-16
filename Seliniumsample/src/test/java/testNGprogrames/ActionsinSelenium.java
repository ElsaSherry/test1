package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionsinSelenium {
	public WebDriver driver;
	Actions action;
  @Test
  public void dragandDrop() {
	  WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement destination=driver.findElement(By.id("amt7"));
			  Actions action=new Actions(driver);
			  action.dragAndDrop(source, destination).build().perform();
  }
  
  @Test
  public void mouseActions() {
	  WebElement agileProjectTab=driver.findElement(By.xpath("//a[text()='Agile Project']"));
	  action= new Actions(driver);
	  action.moveToElement(agileProjectTab).click().build().perform();

  }
  
  @Test
  public void sendKeyClick() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
	  
	  action=new Actions(driver);
	  
	  action.click(messageTextBox).sendKeys("Message").build().perform();
	  WebElement showMessageBtn=driver.findElement(By.id("button-one"));
	  action.sendKeys(showMessageBtn,Keys.ENTER).build().perform();
	  
	  
	  
  }
  
  @Test
  public void keyDown() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
	  
	  action=new Actions(driver);
	  action.click(messageTextBox).sendKeys("Message").build().perform();
	  action.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	  
	  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	
}
  

  @AfterTest
  public void afterTest() {
  }

}
