package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment2b {
	public WebDriver driver;
	
	 @Test
	    public void verifyRememberMeCheckbox() {
	        
	        WebElement rememberMeCheckbox = driver.findElement(By.name("remember_me"));
	        
	        
	        boolean isChecked = rememberMeCheckbox.isSelected();
	        
	     
	        Assert.assertFalse(isChecked, "The 'Remember Me' checkbox should not be checked by default.");
	    }
	 @Test
	    public void verifySuccessfulLogin() {
	        
	        WebElement usernameField = driver.findElement(By.name("username"));
	        usernameField.sendKeys("admin");

	      
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("admin");

	        
	        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	        loginButton.click();

	        
	        WebElement adminNameElement = driver.findElement(By.xpath("//a[contains(text(), 'Admin')]"));
	        boolean isAdminNameDisplayed = adminNameElement.isDisplayed();

	        
	        Assert.assertTrue(isAdminNameDisplayed, "Admin name is not displayed on the home page.");
	    }
	 
	 @Test
	    public void verifyUnsuccessfulLoginInvalidUsername() {
	      
	        driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	        
	        
	        WebElement usernameField = driver.findElement(By.name("username"));
	        usernameField.sendKeys("admin111");

	        
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("admin");

	        
	        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	        loginButton.click();

	        
	        WebElement errorMessage = driver.findElement(By.xpath("//i[contains(text(),' Invalid Username/Password  ')]"));
	        boolean isErrorMessageDisplayed = errorMessage.isDisplayed();

	        // Assertion to check if the error message is displayed
	        Assert.assertTrue(isErrorMessageDisplayed, "Error message for invalid username is not displayed.");
	    }

	    @Test
	    public void verifyUnsuccessfulLoginInvalidPassword() {
	      
	        driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	        
	        
	        WebElement usernameField = driver.findElement(By.name("username"));
	        usernameField.sendKeys("admin");

	        
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("159753");

	     
	        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	        loginButton.click();

	      
	        String actualURL = driver.getCurrentUrl();
	        String expectedURL = "https://groceryapp.uniqassosiates.com/admin";

	      
	        Assert.assertNotEquals(actualURL, expectedURL, "The actual URL matches the expected URL,so an incorrect login.");
	    }

	    


  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	
}
  

  @AfterMethod
  public void afterMethod() {
  }

}
