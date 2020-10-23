package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		    // 1) set up Chrome driver
		
			System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
		
			// 2) call Chrome driver constructor
			WebDriver driver=new ChromeDriver();
			
			// 3) open the site
			driver.get("https://www.Expedia.com"); 
		
			// 4) maximize the browser
			//driver.manage().window().maximize();
			
			
driver.findElement(By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon'])[1]")).click();
driver.findElement(By.xpath("//button[@aria-label='Oct 20, 2020']")).click();
driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();

			

			
			
		
		
		
		
	
		
	}
}
