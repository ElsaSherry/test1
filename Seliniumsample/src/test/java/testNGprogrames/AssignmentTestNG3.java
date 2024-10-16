package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AssignmentTestNG3 {
	public WebDriver driver;
	WebDriverWait wait;
	 @Test
	    public void verifyCorrectPageOpens() {
	        
	        WebElement loginPanel =driver.findElement(By.id("app"));
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	        		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app")));
	        Assert.assertTrue(loginPanel.isDisplayed(), "Login panel is not displayed.");
	    }

	    @Test
	    public void verifyLogoDisplayed() {
	        
	        WebElement logo =driver.findElement(By.xpath("//img[@alt='company-branding']"));
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	        		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
	        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed .");
	    }

	    @Test
	    public void verifyOrangeHRMLink() {
	        
	        WebElement orangeHRMLink = driver.findElement(By.linkText("OrangeHRM, Inc"));
	        Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElementException.class);
			fluent.until(ExpectedConditions.visibilityOf(orangeHRMLink));
		  
	        		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));
	        
	        Assert.assertTrue(orangeHRMLink.isDisplayed(), "OrangeHRM, Inc link is not displayed on the login page.");
	    }

	    @Test
	    public void verifySuccessfulLogin() {
	        
	        WebElement usernameField = driver.findElement(By.name("username"));
	        usernameField.sendKeys("Admin");

	      
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("admin123");

	     
	        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	        loginButton.click();

	   
	        WebElement userPanel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='oxd-userdropdown-name']")));
	        Assert.assertEquals(userPanel.getText(), "Elsa Sherry", "Username on the home page does not match.");
	    }

	    @Test
	    public void verifyAdminUserSearch() {
	        
	        verifySuccessfulLogin();

	        
	        WebElement adminMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
	        adminMenu.click();

	       
	        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	        usernameField.sendKeys("Admin");

	        WebElement userRoleDropdown = driver.findElement(By.xpath("//label[text()='User Role']/following::div[1]"));
	        userRoleDropdown.click();
	        WebElement adminOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']/span[text()='Admin']")));
	        adminOption.click();

	        
	        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
	        searchButton.click();

	        
	        WebElement resultUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Admin']")));
	        Assert.assertTrue(resultUsername.isDisplayed(), "Admin username is not displayed in the search results.");
	    }
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
