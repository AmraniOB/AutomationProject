package ComonListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener  implements ITestListener {
	public WebDriver driver;
	
public void TestStart(ITestResult result) {
	System.out.println("test is started");
}
public void TestSuccess(ITestResult result) {
	
	Date dt=new Date ();
	String sd=dt.toString().replace(" ", "_").replace(" : ", "_") + ".png";
	File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(di , new File("C:/Users/hichamziboukh/eclipse-workspace/Marven/drivers/Picture/picPass"+result.getTestName()+sd));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void TestFailure(ITestResult result) {
	
	Date dt=new Date ();
	String sd=dt.toString().replace(" ", "_").replace(" : ", "_") + ".png";
	File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(di , new File("C:/Users/hichamziboukh/eclipse-workspace/Marven/drivers/Picture/picFail"+result.getTestName()+sd));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
