import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickme1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme1.click();
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		//Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//Thread.sleep(1000);
		WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		driver.switchTo().alert().dismiss();
		WebElement clickme3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickme3.click();
		driver.switchTo().alert().sendKeys("Elsa");
		driver.switchTo().alert().accept();
	

	}

}
