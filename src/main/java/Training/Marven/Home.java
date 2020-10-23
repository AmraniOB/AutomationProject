package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
// how to open the site to test in  chrome browser
		// 1) set up chrome driver
	
		System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
	// 2) call chrome driver constructor
		WebDriver driver=new ChromeDriver();
		
		// 3) open the site
		driver.get("https://www.facebook.com"); 
	
		// 4) How to maximize the browser
		driver.manage().window().maximize();
		
		// 5) how to refresh browser
		        
		Thread.sleep(7000);//<-- # of sec. 
		driver.navigate().refresh();
		
	/*	// 6) how to go backward
		driver.navigate().back();
		
		// 7) how to go forward
		driver.navigate().forward();
		
		// 8) how to find locators
		// right click --> inspect + click on arrow to highlight locator info
		
		/* 
		 * 1) by id 
		 * 2) linktext
		 * 3) partial linktext
		 * 4) classname
		 * 5) Xpath
		 * 6) tagename
		 * 7) Css selector
		 * 8) name (string name)
		 */
		
		//**how to store locators into variable
		
		WebElement CreateAnAccount=driver.findElement(By.id("u_0_2"));
		
		//**how to click on element (create account for this example)
		
		CreateAnAccount.click();
		
		//**how to click on a link
		
		//WebElement Forgotlink=driver.findElement(By.linkText("Forgot Password?"));
		//Forgotlink.click();
		
		//**how to use partial link text
		
		//WebElement Forgotpartial=driver.findElement(By.partialLinkText("Forgot"));
		//Forgotpartial.click();
		
		//**how to use locator by name
		Thread.sleep(4000);
		WebElement FirstNamefid=driver.findElement(By.name("firstname"));
		FirstNamefid.sendKeys("ilyas");
		
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("momy");
		
		WebElement Email=driver.findElement(By.name("reg_email__"));
		Email.sendKeys("fortnite@gmail.com");
		
		WebElement EmailConfirm=driver.findElement(By.name("reg_email_confirmation__"));
		EmailConfirm.sendKeys("fortnite@gmail.com");
		
		WebElement BirthMonth=driver.findElement(By.id("month"));
		BirthMonth.sendKeys("January");
		
		WebElement Passwor=driver.findElement(By.name("reg_passwd__"));
		Passwor.sendKeys("hello 123"); 
		
		
		
		
		
		
	}

}
