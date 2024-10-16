import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadurl 
{
   static WebDriver driver;
	public static void main(String[] args)
	{
      driver=new ChromeDriver();
      driver.get( "https://groceryapp.uniqassosiates.com/home");
      driver.navigate().refresh();
      String title=driver.getTitle();
      System.out.println(title);
      String url=driver.getCurrentUrl();
      System.out.println(url);
      driver.navigate().to("https://groceryapp.uniqassosiates.com/sign-up");
      driver.navigate().refresh();
      driver.navigate().back();
      driver.close();
	}

}
