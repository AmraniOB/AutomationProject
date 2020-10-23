package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


  public class homepage {
	  
	public WebDriver driver;
	
@FindBy(xpath="(//div[@id='nav-logo']/a/span)[1]")
WebElement Amazonicon;

@FindBy(id="twotabsearchtextbox")
WebElement Searchboxfield;

@FindBy(xpath="(//*[@class='nav-input'])[2]")
WebElement Searchiconclick;

@FindBy(id="nav-link-accountList")
WebElement SignInbutton;

@FindBy(xpath="(//*[text()='Sign in'])[1]")
WebElement SignInoption;

@FindBy(linkText= "Customer Service")
WebElement Customer1;



     public homepage(WebDriver driver) {
    	 this.driver=driver;
   PageFactory.initElements(driver, this);
      	 
     }
     public void AmazonIconclick() {
    	 Amazonicon.click();	  
     }
     public void SearchBoxField (String field) {
    	 Searchboxfield.sendKeys(field);
     }
     public void SearchIconClick () {
    	 Searchiconclick.click();
     }
     public void SignInClick() {
    	 Actions ob=new Actions(driver);
    	 ob.moveToElement(SignInbutton).build().perform(); 
     }
     public void SignInHover() {
    	 Actions ob=new Actions(driver);
    	 ob.moveToElement(SignInoption).click().build().perform();
     }
     public WebElement Customerlogo() {
    	 return Customer1;
     }
     
     }

	

