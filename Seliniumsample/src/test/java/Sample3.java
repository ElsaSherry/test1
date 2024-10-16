import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3
{
	static WebDriver driver;

	public static void main(String[] args)
	{
      driver=new ChromeDriver();
      driver.get("https://qalegend.com/billing/public/login");
      driver.manage().window().maximize();
      WebElement username=driver.findElement(By.id("username"));
      username.clear();
      username.sendKeys("admin");
      WebElement password=driver.findElement(By.id("password"));
      password.clear();
      password.sendKeys("123456");
      WebElement login=driver.findElement(By.tagName("button"));
      login.click();
      
      
	}

}
