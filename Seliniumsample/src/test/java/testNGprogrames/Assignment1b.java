package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment1b {
	public WebDriver driver;
  
	@Test
	public void verifyTableHeadings() {
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		int colsize = col.size();
				for (int c = 1; c <= colsize; c++) {
			String text = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[" + c + "]"))
					.getText();
			System.out.println(text);
		}
			}

	@Test
	public void printFirstRowValues() {
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
		int colsize = col.size();
		
		for (int c = 1; c <= colsize; c++) {
			String values = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td[" + c + "]"))
					.getText();
			System.out.println(values);
		}
	}

	  
  
  @BeforeClass
  public void beforeClass() {
	   driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
