import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
static WebDriver driver;
	public static void main(String[] args)
	{
		
//WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();	
//get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.close();
	}

}
