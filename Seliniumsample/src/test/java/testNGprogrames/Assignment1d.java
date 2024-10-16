package testNGprogrames;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Assignment1d {
	public WebDriver driver;

    @Test
    public void testDropdownHandling() {
        // 1. Print all options from the course name dropdown
        WebElement courseDropdown = driver.findElement(By.id("course"));
        Select courseSelect = new Select(courseDropdown);
        List<WebElement> courseOptions = courseSelect.getOptions();
        System.out.println("Course Name Options:");
        for (WebElement option : courseOptions) {
            System.out.println(option.getText());
        }

       
        List<WebElement> dropdowns = driver.findElements(By.tagName("select"));
        System.out.println("Number of dropdowns on the page: " + dropdowns.size());

        
        courseSelect.selectByVisibleText("Java");
        System.out.println("Selected course: " + courseSelect.getFirstSelectedOption().getText());

        
        WebElement ideDropdown = driver.findElement(By.id("ide"));
        Select ideSelect = new Select(ideDropdown);
        boolean isMultiSelect = ideSelect.isMultiple();
        System.out.println("IDE dropdown is multi-select: " + isMultiSelect);        
        
        
        
                
        
        ideSelect.selectByVisibleText("Eclipse");
        ideSelect.selectByVisibleText("NetBeans");
        ideSelect.selectByVisibleText("Visual Studio");

        List<WebElement> selectedOptions = ideSelect.getAllSelectedOptions();
        System.out.println("Selected IDE options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
    }
	
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		driver.manage().window().maximize();
}
  

  @AfterClass
  public void afterClass() { 
  }

}
