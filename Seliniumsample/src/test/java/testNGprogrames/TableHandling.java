package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TableHandling {
WebDriver driver;

@Test
public void verifyNumberOfRowsAndColumn() {

List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
List<WebElement> col=driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
System.out.println("Number of Rows:"+row.size());
System.out.println("Number Of Colums:"+col.size());

}

@Test
public void getValueFromFourthRowFirstColumn() {
WebElement cf=driver.findElement(By.xpath("//table[@class='dataTable']//tr[4]//td[1]"));
String tdText=cf.getText();
System.out.println("The Text iS: "+tdText);
}

@Test
public void findBataIndiaFromTable() {
//Error
List<WebElement> rowx=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
List<WebElement> colx=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
int rowCount=rowx.size();
int colCount=colx.size();
for (int row = 1; row < rowCount; row++) {
for(int col=1;col<=colCount;col++) {
String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+(row+1)+"]//td["+col+"]")).getText();
if(text.equals("Bata India")) {
System.out.println("Found the value at - row:"+row+" col:"+col);
break;
}
}
}
}

@Test
public void findAPurticularValueFromTable() {
driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> rowx=driver.findElements(By.xpath("//table[@id='customers']//tr"));
List<WebElement> colx=driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td"));
int rowCount=rowx.size();
int colCount=colx.size();
boolean flag=false;
for (int row = 1; row < rowCount; row++) {
for(int col=1;col<=colCount;col++) {
String text = driver.findElement(By.xpath("//table[@id='customers']//tr["+(row+1)+"]//td["+col+"]")).getText();
if(text.equals("Island Trading")) {
flag=true;
System.out.println("Found the value at - row:"+row+" col:"+col);
System.out.println(text);
break;
}
}
}
if(flag)
{
System.out.println(flag);
}
}

@BeforeTest
public void beforeTest() {
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/web-table-element.php");
driver.manage().window().maximize();
}

@AfterTest
public void afterTest() {
//driver.quit();
}

}
