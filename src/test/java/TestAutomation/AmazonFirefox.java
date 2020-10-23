package TestAutomation;

import org.testng.annotations.Test;
import Pages.homepage;
import org.testng.annotations.BeforeClass;
//import java.io.File;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class AmazonFirefox {
	public WebDriver driver;
	 
  @Test
  public void f() {
	// this is annotation 
		  //System.out.println(" this is testing area");
		  homepage it=new homepage(driver);
		  it.AmazonIconclick();
		 // it.SearchBoxField();
		  it.SearchIconClick();
		
	  
  }
  @BeforeClass
  public void beforeClass() {
	  // this is to open window before commend
	  //System.out.println("this is before test");
	 System.setProperty("webdriver.gecko.driver","/Users/hichamziboukh/Downloads/geckodriver"); 
	 // File pathBinary = new File("/Users/hichamziboukh/Downloads/geckodriver");
	 // FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
	  FirefoxOptions options = new FirefoxOptions();
	  	  
	   WebDriver driver = new FirefoxDriver(options); 
	  	  
	        driver=new FirefoxDriver();   
	        driver.get("https://www.amazon.com"); 
	        driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	 // System.out.println("this is after test");
	  // this is to close window after commend
	  driver.close();
	  
  }

}
