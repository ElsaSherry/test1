import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		WebElement inputForm=driver.findElement(By.className("(//a[@class='nav-link'])[2]"));
		inputForm.click();
		WebElement checkBoxdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxdemo.click();
		List<WebElement>checkboxes=driver.findElements(By.className("check-box-list"));
		for(WebElement element:checkboxes)
		{
			element.click();
			
		}
		//driver.close();

	}

}
