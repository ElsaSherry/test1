import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebelementCommand1 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.id("single-input-field"));
		String s=message.getAttribute("placeholder");
		System.out.println(s);
		System.out.println(message.getTagName());
		System.out.println(message.getLocation());	
		Point point1=message.getLocation();
		System.out.println(point1);
		message.sendKeys("Hello");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		System.out.println(showMessageButton.getCssValue("font-family"));
		showMessageButton.click();
		WebElement resultMessage=driver.findElement(By.id("message-one"));
		String result=resultMessage.getText();
		System.out.println(result);
		WebElement checkBoxdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxdemo.click();
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
		checkbox.click();
		boolean aa=checkbox.isSelected();		
		System.out.println(aa);
		String at=checkbox.getAttribute(result);
		System.out.println(at);
      Point point=checkbox.getLocation();
      System.out.println(point);
		

	}

}
