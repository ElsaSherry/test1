package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment1e { 
	public WebDriver driver;
	@Test
	public void addProfilePhotoBySendKeys() throws InterruptedException {
	WebElement profilePhotoButton = driver.findElement(By.xpath("//*[@class='octicon octicon-pencil']"));;
    profilePhotoButton.click();

    
    //Thread.sleep(2000); 

    
    WebElement uploadElement = driver.findElement(By.xpath("//label[@class='dropdown-item text-normal']"));
    //uploadElement.click();
    uploadElement.sendKeys("C:\\Users\\asher\\Downloads\\newimage.jpg");
   // Thread.sleep(3000); 
  // driver.findElement(By.xpath("(//span[@class='Button-content'])[6]")).click();
    

    
   // WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
   // confirmButton.click();

    
    System.out.println("Profile photo uploaded successfully!");
}

	
	@Test
	  public void verifyFileUpload() throws AWTException, InterruptedException { 
			
			
		 WebElement choosefile= driver.findElement(By.xpath("//*[@id=\"settings-frame\"]/div[2]/div[2]/dl/dd/div/details/summary/div"));;
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", choosefile);

		 Thread.sleep(1000);
		 WebElement uploadElement1 = driver.findElement(By.xpath("//label[@class='dropdown-item text-normal']"));
		 uploadElement1.click();
		 //create Robot object
		  
		 Robot rb=new Robot();
		 
		 
		 
			StringSelection filePath = new StringSelection("C:\\Users\\asher\\Downloads\\newimage.jpg");
			
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
					
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.delay(12);
					rb.keyPress(KeyEvent.VK_V);
					
				
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.delay(12);
					rb.keyRelease(KeyEvent.VK_V);
					
					
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.delay(12);
					rb.keyRelease(KeyEvent.VK_ENTER);
					System.out.println("Profile photo uploaded successfully!..");
		  
	  }

  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
		driver.get("https://github.com/settings/profile");
		driver.manage().window().maximize();
		
		 driver.findElement(By.id("login_field")).sendKeys("ElsaSherry");
	     driver.findElement(By.id("password")).sendKeys("annammageorge12");
	        
	     driver.findElement(By.name("commit")).click();
	     
	     driver.navigate().to("https://github.com/settings/profile");
}
  

  @AfterClass
  public void afterClass() {
  }

}
