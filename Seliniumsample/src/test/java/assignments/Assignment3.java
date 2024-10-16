package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement home=driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		boolean aa=home.isDisplayed();
		System.out.println(aa);
		WebElement input=driver.findElement(By.xpath("(//a[contains(@href,'simple-form')])[1]"));
		boolean bb=input.isDisplayed();
		System.out.println(bb);
		WebElement datepickers=driver.findElement(By.xpath("//a[starts-with(@href,'date')]"));
		boolean cc=datepickers.isDisplayed();
		System.out.println(cc);
		WebElement table=driver.findElement(By.xpath("//a[contains(@href,'table')]"));
		boolean dd=table.isDisplayed();
		System.out.println(dd);
		WebElement progressbar=driver.findElement(By.xpath("(//a[@class='nav-link'])[5]"));
		boolean ee=progressbar.isDisplayed();
		System.out.println(ee);
		WebElement alertsandmodels=driver.findElement(By.xpath("//a[contains(text(),'Alerts and Modals')]"));
		boolean ff=alertsandmodels.isDisplayed();
		System.out.println(ff);
		WebElement listbox=driver.findElement(By.xpath("(//a[starts-with(@class,'nav-link')])[7]"));
		boolean gg= listbox.isDisplayed();
		System.out.println(gg);
		WebElement others=driver.findElement(By.xpath("(//a[starts-with(@class,'nav-link')])[8]"));
		boolean hh=others.isDisplayed();
		System.out.println(hh);
		WebElement simpleform=driver.findElement(By.xpath("(//a[contains(@href,'simple')] )[2]"));
		boolean ii=simpleform.isDisplayed();
		System.out.println(ii);
		WebElement selectinput=driver.findElement(By.xpath("(//a[contains(@href,'select')])[1]"));
		boolean jj=selectinput.isDisplayed();
		System.out.println(jj);
		WebElement singleinput=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		boolean kk=singleinput.isDisplayed();
		System.out.println(kk);
		WebElement entermessage=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		boolean ll=entermessage.isDisplayed();
		System.out.println(ll);
		WebElement showmessage=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		boolean mm=showmessage.isDisplayed();
		System.out.println(mm);
		WebElement yourmessage=driver.findElement(By.xpath("(//div[starts-with(@class,'my')])[1]"));
		boolean nn=yourmessage.isDisplayed();
		System.out.println(nn);
		
		
		
		

	}

}
