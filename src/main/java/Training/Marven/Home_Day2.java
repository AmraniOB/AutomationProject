package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Day2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 
		
//WebElement Ids=driver.findElement(By.xpath("(/html/body/div//div/div/div/div/div/div/div/div/form/div/div/input)[1]"));
//Ids.sendKeys("yeah");

WebElement Email=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
Email.sendKeys("Hello@gmail.com");

WebElement Password=driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
Password.sendKeys("Yeah");
	
WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
Login.click(); 


	}
	

}
