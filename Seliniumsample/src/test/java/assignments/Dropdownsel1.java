package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsel1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement clourDropdown1=driver.findElement(By.id("single-input-field"));
		clourDropdown1.click();
		
		Select select=new Select(clourDropdown1);
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.selectByValue("Green");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Red");
		WebElement value1=select.getFirstSelectedOption();
		System.out.println(value1.getText());
		
		
	/*	 List<WebElement> li = select.getAllSelectedOptions();
		    
	    for (WebElement webElement : li) {
				System.out.println(webElement.getText());
			}
		    
	    List<WebElement> li1 =select.getOptions();
		    
		    for (WebElement webElement : li1) {
				System.out.println(webElement.getText());
			}
		    */
		    
		   Boolean check=select.isMultiple();
		   System.out.println(check);
		   
		   
		   WebElement colourDrop2=driver.findElement(By.id("multi-select-field"));
		   Select select1=new Select(colourDrop2);
		   select1.deselectByIndex(2);
		   select1.deselectByIndex(1);
		   select1.deselectByIndex(0);
		   
		   List<WebElement> li3=select1.getAllSelectedOptions();
		   for(WebElement element1 : li3)
		   {
			   System.out.println(element1.getText());
		   }
				   
		   
		
		

	}

}
