package com.testng;

import org.testng.annotations.Test;

public class InvocationCountRepeatedTest 
{
	@Test(invocationCount = 10)
public void sum()
{
	int a=20;
	int b=10;
	int c=a+b;
	System.out.println("sum is====="+c);
}
}
