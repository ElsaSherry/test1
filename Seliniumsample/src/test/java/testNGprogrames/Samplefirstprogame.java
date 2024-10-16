package testNGprogrames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Samplefirstprogame {
  @Test
  public void Testcase1() {
	  System.out.println("the first testcae");
  }
  @Test
  public void Testcase2() {
	  System.out.println("the second testcae");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("the before method1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("the after method1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("the before method2");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("the after method2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("the before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("the after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("the before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("the after suite");
  }

}
