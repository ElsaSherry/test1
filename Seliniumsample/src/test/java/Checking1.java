import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message = driver.findElement(By.id("single-input-field"));
		String s = message.getAttribute("placeholder");
		System.out.println(s);
		System.out.println(message.getTagName());
		Point p=message.getLocation();
		System.out.println(p);
		

	}

}
