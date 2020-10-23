package Training.Marven;
 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	public static void main(String[] args) throws InterruptedException {
		
		 // 1) set up Chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
		// 2) call Chrome driver constructor
		WebDriver driver=new ChromeDriver();
		// 3) open the site
		driver.get("https://jqueryui.com/droppable/"); 
		Actions obj=new Actions (driver);
     
		//obj.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in'"))).build().perform();
		//obj.moveToElement((WebElement) driver.findElements(By.xpath("//*[text()='explore Showroom']"))).click().build().perform();
			
		driver.switchTo().frame(0);
		
WebElement Drag=driver.findElement(By.id("draggable"));
WebElement Drop=driver.findElement(By.id("droppable"));
Thread.sleep(4000);
obj.dragAndDrop(Drag, Drop).build().perform();
Thread.sleep(4000);

driver.switchTo().parentFrame();
WebElement sort= driver.findElement(By.linkText("Sortable"));
String windowhandle=driver.getWindowHandle(); // this is the parent class windowhandle
System.out.println(windowhandle);
obj.keyDown(Keys.SHIFT).click(sort).build().perform();// opening the link on a new window

Set<String> otherwindows=driver.getWindowHandles(); // storing windowhandle for both windows tab
            for(String Window:otherwindows) {
            	System.out.println(Window);
 
            	if(Window.equalsIgnoreCase(windowhandle)) {
            	System.out.println("this is parent window");
            	
            }else { 
            	System.out.println("this is other window");
            	driver.switchTo().window(Window);
            	
            }
            	
            }
            
           // String Window=driver.findElement(By.xpath("//*[contains(text(),'Reorder elements in ')]")).getText();
          //  System.out.println(Window);
           // driver.switchTo().window(windowhandle);
            
          //  System.out.println(driver.getCurrentUrl());
            
	}
}




	


