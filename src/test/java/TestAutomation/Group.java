package TestAutomation;

import org.testng.annotations.Test;

public class Group {
	
  @Test (groups= {"Function"})

  public void test1() {
	  System.out.println("this is for test1 Fun");
  }
@Test(groups= {"Regression","Sanity"})

  public void test3() {
	System.out.println("this is for test3 Reg & san");
	
}
@Test (groups= {"Regression"})
public void test4() {
	System.out.println("this is for test4 Reg");
	
}
@Test (groups= {"Sanity"})
public void test8() {
	System.out.println("This is for test8 San");
	
}
}