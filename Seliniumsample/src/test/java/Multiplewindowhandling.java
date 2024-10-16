import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowhandling {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement newWindow1=driver.findElement(By.id("newWindowBtn"));
		String curTitle=driver.getTitle();
		System.out.println(curTitle);
		
		
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		newWindow1.click();
		
		Set<String> allWindowhandling=driver.getWindowHandles();
		System.out.println(allWindowhandling);
		
		for(String handle :allWindowhandling)
		{
			if(!handle.equalsIgnoreCase(parentWindow));
			{
			driver.switchTo().window(handle);
			// all child window operations aredone in if condition
			driver.manage().window().maximize();
			
			
			String childTitle=driver.getTitle();
			System.out.println(childTitle);
			
			String newUrl=driver.getCurrentUrl();
			System.out.println(newUrl);
		}
		}
		driver.quit();
		//driver.switchTo().window(parentWindow);

	}

}
