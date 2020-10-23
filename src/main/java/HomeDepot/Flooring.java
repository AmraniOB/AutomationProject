package HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class Flooring {
	public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://homedepot.com");
	Actions action=new Actions (driver);
	Thread.sleep(3000);
	
	WebElement element= driver.findElement(By.linkText("All Departments"));
	action.moveToElement(element).build().perform();
	Thread.sleep(3000);
	WebElement element2= driver.findElement(By.xpath("(//*[@title='Flooring & Area Rugs'])[1]"));
	action.moveToElement(element2).build().perform();
	
	WebElement element3= driver.findElement(By.xpath("(//*[@class='MainFlyout__link'])[22]"));
	action.moveToElement(element3).build().perform();
	
	Thread.sleep(3000);
	WebElement element4= driver.findElement(By.xpath("//*[@title='Floor Tile']"));
	action.moveToElement(element4).click(element4).build().perform();
	
    WebElement element5= driver.findElement(By.xpath("//input[@id='bwo6i-1']"));
    action.moveToElement(element5).click().build().perform();
	
	Thread.sleep(4000);
	driver.close();
	
}
		
	}

