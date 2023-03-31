package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SecondTest {
  @Test(priority=1,description="tests 1nd")//as priority is given as it will be executed as alphabetic
  //so we are give it in priority based and description we can give anything that we want.
  public void f() {
	 
	  System.out.println("from test methodf()");
  }
  
  @Test(priority=2,description="tests 2nd")
  public void a() {
	  System.out.println("from test method a()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from afterTest()");
  }

}
