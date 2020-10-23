package TestAutomation;

import org.testng.annotations.Test;


import LeCakeB.LCBHomePage;
import Pro.Sharingcode;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LeCake extends Sharingcode {
	public WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException, IOException {

	  LCBHomePage it=new LCBHomePage(driver);
	  
	  it.StepOne();
pictures();

	  it.StepTwo();
	  Thread.sleep(2000);

	  it.StepThree();
	  Thread.sleep(2000);
pictures();	  
	  it.Stepfour();
	  Thread.sleep(2000);
pictures();  
	  it.StepFive();
	  Thread.sleep(2000);
pictures();
	  it.Stepsix();
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  
// verify URL   //
	String ActualURL=driver.getCurrentUrl();
	System.out.println(ActualURL);
	Assert.assertEquals(ActualURL, "https://www.lecakeboutique.com/shop");

	  

	WebElement cake= it.Laststep();
    boolean Cakelogo = cake.isDisplayed();
    Assert.assertEquals(Cakelogo, true);
	  
  } 
 
  @BeforeClass
  public void beforeClass() {
  browsers ("chrome");
  
  }
  

  @AfterClass
  public void afterClass() {
    driver.close();
    
  }
 public void browsers(String Br) {
	  
	  if(Br.equalsIgnoreCase("chrome")) {
		  
System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.lecakeboutique.com");
driver.manage().window().maximize();

	  }else if (Br.equalsIgnoreCase("Firefox")) {
		  
 System.setProperty("webdriver.gecko.driver","/Users/hichamziboukh/Downloads/geckodriver");
 driver=new FirefoxDriver();
 driver.get("https://www.lecakeboutique.com");
 driver.manage().window().maximize();
  
	  
	  }
}
}
	  
	  
	  

