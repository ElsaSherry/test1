package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4b 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://qalegend.com/restaurant/");
		driver.manage().window().maximize();
		
		
		//driver.navigate().refresh();
		
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("lulla");
		
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement login=driver.findElement(By.name("submit"));
		login.click();
		
		WebElement textDisplay=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		String s=textDisplay.getText();
		System.out.println(s);
		
		WebElement product=driver.findElement(By.xpath("(//*[@class='menu-text'])[2]"));
		product.click();
		
		WebElement addProduct=driver.findElement(By.xpath("//button[@class='btn btn-add btn-lg']"));
		addProduct.click();
		
		JavascriptExecutor j=(JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView);",addProduct );
	    j.executeScript("arguments[0].click();",addProduct);
		
		WebElement code=driver.findElement(By.id("ProductCode"));
		code.clear();
		code.sendKeys("1111");
		
		WebElement name=driver.findElement(By.id("ProductName"));
		name.clear();
		name.sendKeys("Tomato");
		
		WebElement purchasePrice=driver.findElement(By.id("PurchasePrice"));
		purchasePrice.clear();
		purchasePrice.sendKeys("199");
		
		WebElement price=driver.findElement(By.id("Price"));
		price.clear();
		price.sendKeys("100");
		
		WebElement submitButton=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submitButton.click();

	}

}
