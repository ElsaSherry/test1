package assignments;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment5a 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement newTabButton=driver.findElement(By.id("newTabBtn"));
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		newTabButton.click();
		
		 String parentWindowHandle=driver.getWindowHandle();
		Set <String> allOpenedWindowHandles=driver.getWindowHandles();
		for(String handle:allOpenedWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				
				WebElement clickmeButtonSimpleAlert=driver.findElement(By.xpath("//button[@id='alertBox']"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)",clickmeButtonSimpleAlert );
				clickmeButtonSimpleAlert.click();
				
				String text1=driver.switchTo().alert().getText();
				System.out.println(text1);
				driver.switchTo().alert().accept();
				
				WebElement  clickmeButtonPromptAlert=driver.findElement(By.id("promptBox"));
				clickmeButtonPromptAlert=driver.findElement(By.xpath("//button[@id='promptBox']"));
				js.executeScript("arguments[0].scrollIntoView(true)",clickmeButtonPromptAlert );
				clickmeButtonPromptAlert.click();
				
				driver.switchTo().alert().sendKeys("Elsa");
				driver.switchTo().alert().accept();
				
				WebElement promptText=driver.findElement(By.xpath("//div[@id='output']"));
				String promptTextMessage=promptText.getText();
				System.out.println(promptTextMessage);
				
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.quit();

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
