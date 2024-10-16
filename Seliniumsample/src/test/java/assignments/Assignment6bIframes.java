package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6bIframes {

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get( "https://groceryapp.uniqassosiates.com/sign-up");
		driver.manage().window().maximize();
		
		WebElement firstName=driver.findElement(By.name("fname"));
		firstName .sendKeys("Priya");
		
		WebElement lastName=driver.findElement(By.name("lname"));
		lastName.sendKeys("jain");
		
		WebElement email=driver.findElement(By.xpath("(//input[@id='ap_email'])[3]"));
		email.sendKeys("abcdefg@gmail.com");
		
		WebElement phoneNumber=driver.findElement(By.xpath("(//input[@id='ap_email'])[4]"));
		phoneNumber.sendKeys("9124567890");
		
		WebElement password=driver.findElement(By.id("password1"));
		password.sendKeys("abcd1");
		
		WebElement passwordConfim=driver.findElement(By.id("password2"));
		passwordConfim.sendKeys("abcd1");
		
		WebElement signUpButton=driver.findElement(By.className("next_ch02"));
		signUpButton.click();
		
		if (driver.getCurrentUrl().contains("otp")) {
            System.out.println("OTP page verification successful.");
        } else {
            System.out.println("OTP page verification failed.");
        }
		
		driver.close();
		
		

	}

}
