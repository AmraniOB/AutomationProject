package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"); 
	//    driver.findElements(By.xpath("//*[text()='Simple Alert']")).click();
	  
	   driver.switchTo().alert().accept();
	   driver.switchTo().alert().dismiss();
	   driver.switchTo().alert().sendKeys("Yes");
	   driver.switchTo().alert().accept();
	   
		
	}

}
