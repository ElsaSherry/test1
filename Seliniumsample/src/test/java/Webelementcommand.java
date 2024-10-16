import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementcommand {

	public static void main(String[] args)
	{
WebDriver driver= new ChromeDriver();
driver.get("https://groceryapp.uniqassosiates.com/admin/login");
driver.manage().window().maximize();

WebElement username=driver.findElement(By.name("username"));
username.clear();
username.sendKeys("admin");
WebElement password=driver.findElement(By.name("password"));
password.clear();
password.sendKeys("admin");


WebElement signin=driver.findElement(By.tagName("button"));
signin.click();

                        





//driver.close();
	}

}
