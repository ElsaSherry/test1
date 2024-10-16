package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CheckboxFindElement {
	WebDriver driver;
  @Test
  public void verifyTheCheckboxesUsingSendKeys() {
	  WebElement inputForm=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	  inputForm.click();
	  WebElement  checkBoxDemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	  checkBoxDemo.click();
	  List<WebElement>checkBoxes1=driver.findElements(By.id("gridCheck"));
	 for(WebElement element:checkBoxes1){
		 element.click();
		  
	  }
	 
  }
  @Test
  public void verifyTheMultipleCheckboxesUsingSendKeys() {
	  WebElement inputForm=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	  inputForm.click();
	  WebElement  checkBoxDemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	  checkBoxDemo.click();
	  List<WebElement>checkBoxes2=driver.findElements(By.xpath("//input[@class='check-box-list']"));
	 for(WebElement element1:checkBoxes2){
		 element1.click();
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

}
