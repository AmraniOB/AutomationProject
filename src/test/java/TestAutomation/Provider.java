package TestAutomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.homepage;
import Pro.Sharingcode;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Provider extends Sharingcode{
  @Test(dataProvider = "dp")
  public void f(String s) throws IOException {
	  
	  homepage it=new homepage(driver);	 
	  
	  it.AmazonIconclick();
	  pictures();

	  it.SearchBoxField(s);
	  pictures();
	 
	  it.SearchIconClick();
	
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"phones"},
      new Object[] { "kids toy"},
      new Object[] {"store"}
    };
  }
}
