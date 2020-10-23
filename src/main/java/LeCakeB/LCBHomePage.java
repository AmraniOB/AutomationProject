package LeCakeB;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LCBHomePage {
	public WebDriver driver;
	
	@FindBy(id="comp-j7efzy2t0label")
	WebElement homebutton;

	@FindBy(xpath="(//*[@class='style-k1a292cmrepeaterButtonlabel'])[3]")
	WebElement Menu;

	@FindBy(xpath="(//*[@class='style-k1a292cmrepeaterButtonlabel'])[8]")
	WebElement Shopbutton ;

	@FindBy(xpath="//img[@alt='French Macaron  Box of 6 ( Gluten Free ) Vanilla, Coffee&Lemon'] ")
	WebElement Selectbutton ;

	@FindBy(xpath="//input[@type='number']")
	WebElement AmountKeys;
	
	@FindBy(xpath="//span[@class='buttonnext3240602146__content']")
	WebElement AddToCart;
	
	@FindBy(id="comp-jzkh3hr4imgimage")
	WebElement CakeLogo;
    
public LCBHomePage (WebDriver driver) {
	 this.driver=driver;
PageFactory.initElements(driver, this);

}
public void StepOne() {
	homebutton.click();
}
public void StepTwo() {
	Menu.click();
}
public void StepThree() {
	Shopbutton.click();
}
public void Stepfour() {
	Selectbutton.click();
}
public void StepFive() {
	AmountKeys.clear();
	AmountKeys.sendKeys("3");
}
public void Stepsix() {
	AddToCart.click();
}
public WebElement Laststep() {
	return CakeLogo;
	
}
}


