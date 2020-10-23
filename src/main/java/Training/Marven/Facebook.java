package Training.Marven;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {
		
// 1) open and set chrome driver
System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
						
// 2) call chrome driver constructor
		WebDriver driver=new ChromeDriver();
	// exception 
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
										
// 3) open the site
		driver.get("https://www.facebook.com"); 
		
// 4) find element
		//1) store locator into variable
WebElement CreatAnAccount=driver.findElement(By.id("u_0_2"));
       //2) click on element ("create account" for this exemple)
CreatAnAccount.click();

		
// 5) fill in content by using locators
Thread.sleep(5000);

WebElement Fname=driver.findElement(By.name("firstname"));
Fname.sendKeys("north");
Thread.sleep(2000);
WebElement Lname=driver.findElement(By.name("lastname"));
Lname.sendKeys("West");

WebElement Email=driver.findElement(By.name("reg_email__"));
Email.sendKeys("NorthW@gmail.com");
Thread.sleep(2000);
WebElement Cemail=driver.findElement(By.name("reg_email_confirmation__"));
Cemail.sendKeys("NorthW@gmail.com");

WebElement Password=driver.findElement(By.name("reg_passwd__"));
Password.sendKeys("hello123");
Thread.sleep(2000);
WebElement DOBmonth=driver.findElement(By.id("month"));
DOBmonth.sendKeys("february");
Thread.sleep(2000);
WebElement DOBday=driver.findElement(By.id("day"));
DOBday.sendKeys("12");
Thread.sleep(2000);
WebElement DOByear=driver.findElement(By.id("year"));
DOByear.sendKeys("1975");
Thread.sleep(2000);
WebElement Gender=driver.findElement(By.name("sex"));
Gender.click(); 

Thread.sleep(4000);
WebElement close=driver.findElement(By.id("u_1_9"));
close.click();

Thread.sleep(3000);
driver.navigate().back();

Thread.sleep(3000);
driver.navigate().forward();













	}

}
