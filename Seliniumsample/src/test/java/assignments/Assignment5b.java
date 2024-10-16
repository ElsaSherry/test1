package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5b
{

	public static void main(String[] args)
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html" );
		driver.manage().window().maximize();
		
		WebElement openMultiWindowButton=driver.findElement(By.id("newWindowsBtn"));
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		// String parentWindowHandle=driver.getWindowHandle();
		openMultiWindowButton.click();
		
		
		 Set<String> windowHandles = driver.getWindowHandles();
	        String parentWindowHandle = driver.getWindowHandle();
			for (String windowHandle : windowHandles)
			{
	            
	            driver.switchTo().window(windowHandle);
	            String windowTitle = driver.getTitle();
	            if (windowTitle.equals("XPath Practice - H Y R Tutorials")) 
				
				{
					driver.switchTo().window(windowHandle);
					//String title=driver.getTitle();
					driver.manage().window().maximize();
					
					
					WebElement firstname=driver.findElement(By.xpath(("//input[@name='name'])[1]")));
					JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true)", firstname);
					firstname.sendKeys("Elsa");
					
					WebElement lastname=driver.findElement(By.xpath("(//input[@name='name'])[2]"));
					lastname.sendKeys("Sherry");
					
					WebElement email=driver.findElement(By.xpath("(//input[@required])[1]"));
					email.sendKeys("abc@gmail.com");
					
					WebElement password=driver.findElement(By.xpath("(//input[@required])[2]"));
					password.sendKeys("1234");
					
					WebElement repeatPassword=driver.findElement(By.xpath("(//input[@required])[3]"));
					repeatPassword.sendKeys("1234");
					
					WebElement register=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
					register.click();
					driver.close();
					
					}
				
				
					else if (windowTitle.equals("Basic Controls - H Y R Tutorials"))
					{
						WebElement firstName1=driver.findElement(By.name("fName"));
						firstName1.sendKeys("Priya");
						
						WebElement lastName1=driver.findElement(By.name("lName"));
						lastName1.sendKeys("Rana");
						
						WebElement femaleRadioButton=driver.findElement(By.id("femalerb"));
						femaleRadioButton.click();
						
						WebElement checkBoxEnglish=driver.findElement(By.id("englishchbx"));
						checkBoxEnglish.click();
						WebElement checkBoxHindi=driver.findElement(By.id("hindichbx"));
						checkBoxHindi.click();
						
						WebElement email=driver.findElement(By.id("email"));
						email.sendKeys("efg@gmail.com");
						
						WebElement password=driver.findElement(By.id("password"));
						password.sendKeys("123456");				
										
						
						WebElement register1=driver.findElement(By.id("registerbtn"));
						register1.click();
					
						driver.close();
					}
					
					
						
				}	
						
					
				
			driver.switchTo().window(parentWindowHandle);
			 
			WebElement heading1=driver.findElement(By.xpath("(//h1[@itemprop='name'])"));
			System.out.println(heading1.isDisplayed());
			System.out.println(heading1.getText());
			
	
			}
			
				
			
	}


