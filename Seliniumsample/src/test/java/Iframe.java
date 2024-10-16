import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//WebElement iFrame1=driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(iFrame1);
		
		//driver.switchTo().frame("frame1");
		
		driver.switchTo().frame(3);
		
		WebElement text1=driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement text2=driver.findElement(By.id("sampleHeading"));
		System.out.println(text2.getText());
		

	}

}
