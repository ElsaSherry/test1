import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecuter {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		WebElement addToCartButton=driver.findElement(By.xpath("//a[contains(@onclick,'614')]"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView();", addToCartButton);
		
		
		//j.executeScript("window.scrollBy(0,250)");
		//j.executeScript("arguments[0].click();",addToCartButton);
		addToCartButton.click();
		//j.executeScript("window.scrollBy (0,-250)");

	}

}
