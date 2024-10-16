import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		List<WebElement>tabs=driver.findElements(By.className("nav-link"));
		
		for(WebElement element:tabs)
		{
			boolean b=element.isDisplayed();
					System.out.println(b);
		}
	}

}
