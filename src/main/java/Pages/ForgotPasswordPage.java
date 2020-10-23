package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ForgotPasswordPage {
public WebDriver driver;
@FindBy(name="email")
WebElement EmailField;
@FindBy(id="continue")
WebElement CBC;

public ForgotPasswordPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void Emailkeys () {
	EmailField.sendKeys("Protraining@gmail.com");
}
public void ContinueButton () {
	CBC.click();
}
}
