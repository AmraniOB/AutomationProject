package Training.Marven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
								
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com"); 
				
		        WebElement CreatAnAccount=driver.findElement(By.id("u_0_2"));
		        CreatAnAccount.click();
		        

		
		

	}

}
