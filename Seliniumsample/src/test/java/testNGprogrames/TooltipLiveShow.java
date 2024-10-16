package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TooltipLiveShow {
	public WebDriver driver;
	 @Test
	    public void verifyLiveTooltip() {
	        
		 WebElement liveElement= driver.findElement(By.xpath("(//h4[contains(text(),'Live')])[1]//parent::span//parent::a"));
	      

	        
	       Actions actions = new Actions(driver);
	        actions.moveToElement(liveElement).build().perform();

	    
	        String tooltipText = liveElement.getAttribute("title");

	        
	        Assert.assertEquals(tooltipText, "Live", "Tooltip text does not match expected value.");
	    }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.get(" https://www.browserstack.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
