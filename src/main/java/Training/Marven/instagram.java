package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// open and set chrome driver
System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
				
		// 2) call chrome driver constructor
WebDriver driver=new ChromeDriver();
						
		// 3) open the site
driver.get("https://www.instagram.com"); 	
						
		//**how to use locator by name
						
	Thread.sleep(4000);
				WebElement FirstNamefid=driver.findElement(By.name("username"));
				FirstNamefid.sendKeys("ojrd18#");	
				
				WebElement Password=driver.findElement(By.name("password"));
				Password.sendKeys("tryingout");
				
				Thread.sleep(3000);
				driver.navigate().back();
				
				Thread.sleep(3000);
				driver.navigate().forward();
				
	}

}
