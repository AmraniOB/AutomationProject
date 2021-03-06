package Pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
      
public WebDriver driver;
	
@FindBy(linkText = "Need help?")
WebElement NeedHelpOption;
@FindBy(linkText = "Forgot your password?")
WebElement ForgotPassword;

public SignInPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,  this);
	

	}
public void NeedHelp() {
	NeedHelpOption.click();
}
public void ForgotPasswordClick() {
	ForgotPassword.click();
}
}
