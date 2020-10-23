package TestAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.homepage;
import Pro.Sharingcode;

public class PorpretiesPro2 extends Sharingcode{
  @Test
  public void f() throws IOException, InterruptedException {
	  
homepage it=new homepage(driver);	 
	  
	  it.AmazonIconclick();
	  pictures();
	System.out.println(System.getProperty("user.dir"));  
	  
	  Properties pro=new Properties();
	  FileInputStream ob=new FileInputStream(System.getProperty("user.dir")+"/drivers/Amazon.properties");
	  pro.load(ob);
	  String name=pro.getProperty("Name");
	  System.out.println("This is to print properties project ="+name);

	  it.SearchBoxField(name);
	  pictures();
	  it.SearchIconClick();
	 
	
}
}
