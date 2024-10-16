import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement colourDropdowm=driver.findElement(By.id("single-input-field"));
		colourDropdowm.click();
		Select select=new Select(colourDropdowm);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("Yellow");
		Thread.sleep(2000);
		select.selectByVisibleText("Green");
		WebElement value=select.getFirstSelectedOption();
		System.out.println(value.getText());
	
//	    
//	    List<WebElement> li = select.getAllSelectedOptions();
//	    
//	    for (WebElement webElement : li) {
//			System.out.println(webElement.getText());
//		}
//	    
//	    List<WebElement> li1 =select.getOptions();
//	    
//	    for (WebElement webElement : li1) {
//			System.out.println(webElement.getText());
//		}
	    
	    Boolean check = select.isMultiple();
	    System.out.println(check);
	    
		WebElement color1 = driver.findElement(By.id("multi-select-field"));

		Select select1 = new Select(color1);
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		
		List<WebElement> li3 = select1.getAllSelectedOptions();
	    
	    for (WebElement webElement : li3) {
			System.out.println(webElement.getText());
		}
	    
	    WebElement first = select1.getFirstSelectedOption();
	    System.out.println(first.getText());
	    
	    WebElement second=select1.getWrappedElement();
	    System.out.println(second.getText());
	    
	    Boolean check1 = select1.isMultiple();
	    System.out.println(check1);
	    
	    //select1.deselectByIndex(2);
	    select1.deselectAll();
	}




	}


