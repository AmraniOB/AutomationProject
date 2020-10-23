package Pro;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Sharingcode {
	
	public WebDriver driver;
	
@BeforeClass
@Parameters("browser")
public void beforeClass(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver","/Users/hichamziboukh/Downloads/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.Amazon.com");
driver.manage().window().maximize();

	}else if (browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver","/Users/hichamziboukh/Downloads/geckodriver");
		 driver=new FirefoxDriver();
		 driver.get("https://www.Amazon.com");
		 driver.manage().window().maximize();
}
}
@AfterClass
public void afterclass() {
	driver.close();
}
public void pictures() throws IOException {
	Date dt=new Date ();
	String sd=dt.toString().replace(" ", "_").replace(" : ", "_") + ".png";
	File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(di , new File("/Users/hichamziboukh/eclipse-workspace/Marven/drivers/Pictures"+ sd));
	
	}
}

