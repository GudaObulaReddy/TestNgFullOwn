package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTestValidation 
{
	WebDriver driver;
	  @BeforeMethod
	   public void setUp()
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
	   }
	  @Test
	  public void googleTitleTest()
	   {  String title=driver.getTitle();
		   System.out.println(title);
		   Assert.assertEquals(title, "Google","title is not matched");
	   }
	  @Test
	  public void googleLogoTest()
	   {
		 boolean bool=driver.findElement(By.xpath("//img[@alt=\"Stay Home. Save Lives : Help Stop Coronavirus\"]")).isDisplayed();
		 Assert.assertTrue(bool);
	   }
	  @AfterMethod
	   public void tearDown()
	   {
		   driver.close();
	   }
	   

}
