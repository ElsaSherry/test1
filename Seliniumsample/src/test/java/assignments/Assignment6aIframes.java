package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6aIframes {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		 List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		 System.out.println("Number of iframes on the webpage: " + iframes.size());
		 
		 driver.close();

	}

}
