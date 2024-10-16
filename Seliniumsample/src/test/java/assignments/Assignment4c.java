package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment4c 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@src='images/logo.png'][1]"));
		
		Dimension d=logo.getSize();
		System.out.println(d);
		
		Point p=logo.getLocation();
		System.out.println(p);
		
		WebElement inputForm=driver.findElement(By.xpath("(//a[contains(@href,'simple-form')])[1]\r\n"+ ""));
		inputForm.click();
		

		List<WebElement>inputFormText=driver.findElements(By.className("//a[@class='nav-link']"));
		for(WebElement element:inputFormText)
		{
			
			System.out.println(element.getText());
			
		}
		
		WebElement radioButtonBox=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radioButtonBox.click();
		
		WebElement male=driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]"));
		male.click();
		
		
		WebElement showsElectedValue=driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
		showsElectedValue.click();
		
		WebElement messageone=driver.findElement(By.id("message-one"));
		String s=messageone.getText();
		System.out.println(s);
		
		
		WebElement female=driver.findElement(By.xpath("(//label[@class='form-check-label'])[4]"));
		female.click();
		
		WebElement ageSelection=driver.findElement(By.xpath("(//label[@class='form-check-label'])[7]"));
		ageSelection.click();
		WebElement getResult=driver.findElement(By.id("button-two"));
		getResult.click();
	
		WebElement textSecond=driver.findElement(By.id("message-two"));
		String y=textSecond.getText();
		System.out.println(y);
		
		WebElement thirdText=driver.findElement(By.id("message-two"));
		String j=thirdText.getText();
		System.out.println(j);
		
		List<WebElement>radioButtonText=driver.findElements(By.className("//a[@class='form-check-label']"));
		for(WebElement element1:radioButtonText)
		{
			
			System.out.println(element1.getText());
			
		}
		
		
	}
}
