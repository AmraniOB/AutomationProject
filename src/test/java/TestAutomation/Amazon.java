package TestAutomation;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import Pages.ForgotPasswordPage;
import Pages.SignInPage;
import Pages.homepage;
import Pro.Sharingcode;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Amazon extends Sharingcode {
	public WebDriver driver;
	
 @Test (priority = 1)
  public void f() throws IOException {
	// this is testing area//
	  
	  homepage it=new homepage(driver);	  
	  it.AmazonIconclick();
	  pictures();
// verify URL dispalyed is correct//
	  
String ActualURL=driver.getCurrentUrl();
SoftAssert Confirm=new SoftAssert();
Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav-logo");
//Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav-logo6");
//done with verification block//

// this shows error due to provider class//
	//  it.SearchBoxField();
	  pictures();// ignore error for now//
	  
// verify customer service link	  
	  it.SearchIconClick();
	 WebElement Customerlink= it.Customerlogo();
	 boolean Customer1 = Customerlink.isDisplayed();
	 Assert.assertEquals(Customer1, true);
	 Confirm.assertAll();
	 
// verification over//
	  
	  
	  
  }
 /*@Test(priority = 2)
 public void ForgotPasswordFunction() {
	 homepage it=new homepage(driver);	 
 SignInPage ob=new SignInPage (driver);
 ForgotPasswordPage forgot=new ForgotPasswordPage(driver);
 
 it.SignInClick();
 it.SignInHover();
 ob.NeedHelp();
 ob.ForgotPasswordClick();
 forgot.Emailkeys();
 forgot.ContinueButton();*/
  


  @BeforeClass
  @Parameters ("browser")
  public void beforeClass(String browser) {
	 if(browser.equalsIgnoreCase("chrome")) {

	  System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
  }	
	 else if (browser.equalsIgnoreCase("Firefox")) {
		
		 System.setProperty("webdriver.gecko.driver","/Users/hichamziboukh/Downloads/geckodriver");
		 driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com");
		 driver.manage().window().maximize();
  }
  }

  @AfterClass
  public void afterClass() {
	  // this is to close window after commend
	  driver.close();
  }	  
  }
  


