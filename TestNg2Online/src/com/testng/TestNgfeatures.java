package com.testng;



import org.testng.annotations.Test;

public class TestNgfeatures 
{

	@Test
	public void loginTest()
	{
		System.out.println("logon test");
		//int i=9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest()
	{
		System.out.println("search PageTest test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void regPagetest()
	{
		System.out.println("reg Pagetest test");
	}
	
}
