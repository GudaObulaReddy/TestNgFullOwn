package com.parameter.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	WebDriver driver;
@Test
@Parameters({"env","browser","url","emailId"})
public void yahooLoginTest(String env,String browser,String url,String emailId) throws InterruptedException
{
	if(browser.equals("chrome")) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get(url);
	driver.findElement(By.cssSelector("#login-username")).clear();
	driver.findElement(By.cssSelector("#login-username")).sendKeys(emailId);

	driver.findElement(By.xpath("//*[@id=\"login-signin\"]"+Keys.ENTER));
}
}
