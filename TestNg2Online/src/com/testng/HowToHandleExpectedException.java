package com.testng;

import org.testng.annotations.Test;

public class HowToHandleExpectedException 
{
	@Test(expectedExceptions = NumberFormatException.class)
public void test1()
{
	String x="100A";
	Integer.parseInt(x);
}
}
