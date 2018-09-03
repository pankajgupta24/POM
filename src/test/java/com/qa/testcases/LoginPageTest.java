package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testbase.Base;
import come.qa.pages.LoginPage;

public class LoginPageTest extends Base
{
	
	LoginPage loginpage;
	
	public LoginPageTest()
	{
		super();
	}
	
@BeforeMethod
public void setup()
{
	initialization();
	loginpage= new LoginPage();
	
	
}
@Test
public void logintestverify()
{
	System.out.println("test execution is in progress");
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
	
@AfterMethod
public void teardown(){
	driver.quit();
}
}
	


