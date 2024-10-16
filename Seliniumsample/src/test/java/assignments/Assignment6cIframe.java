package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6cIframe {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get( "https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		 driver.switchTo().frame("frm1");
		 
		 WebElement courseDropdown = driver.findElement(By.id("course"));
	     courseDropdown.sendKeys("Java");
	     
	     driver.switchTo().defaultContent(); 
	     driver.switchTo().frame("frm2");
		
	     WebElement firstNameTextbox = driver.findElement(By.xpath("(//input[@id='firstName'])[1]"));
	     String hintText = firstNameTextbox.getAttribute("placeholder");

	        if (hintText.equals("Enter First Name")) {
	            System.out.println("Hint text verification successful. Expected hint text found.");
	        } else {
	            System.out.println("Hint text verification failed. Actual hint text: " + hintText);
	        }

		

	}

}
