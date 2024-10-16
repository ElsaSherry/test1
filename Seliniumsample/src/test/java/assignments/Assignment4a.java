package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4a 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement radioButtonYes=driver.findElement(By.xpath("//input[@id='yes']"));
		boolean ry=radioButtonYes.isSelected();
		System.out.println(ry);
		WebElement radioButtonNo=driver.findElement(By.xpath("//input[@id='no']"));
		boolean rn=radioButtonNo.isSelected();
		System.out.println(rn);
		radioButtonNo.click();

	}

}
