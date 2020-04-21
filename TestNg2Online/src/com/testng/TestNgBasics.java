package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNgBasics 
{    //order of execution
	//setup system property for chrome       1.@BeforeSuite
	//launch chrome browser                  2.@BeforeTest
	//login to app							 3.@BeforeClass
	//enter url								 4.@BeforeMethod
	//google title test                      5.@Test
	//log out from app						 6.@AfterMethod
	//close Browser							 7.@AfterClass
	//delete all coockies                    8.@AfterTest

	//Pre-condition annotations---start with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
@BeforeTest
public void launchBrowser()
{
	System.out.println("launch chrome browser");
}
@BeforeClass
public void login()                          
{
	System.out.println("login to app");
}
@BeforeMethod
public void enterUrl()
{
	System.out.println("enter url");
}
//Test Cases---starts with @Test
@Test
public void googleTitleTest()
{
	System.out.println("google title test");
}
@Test
public void search()
{
	System.out.println("search");
}
//Post conditions----tarts with @After
@AfterMethod
public void logOut()
{
	System.out.println("log out from app");
}
@AfterTest
public void deleteAllCookies()
{
	System.out.println("delete all coockies");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("close Browser");
}
// this one not executed right now
@AfterSuite
public void generateTestReport()
{
	System.out.println("generate test report");
}





}
