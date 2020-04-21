package com.testng;

import org.testng.annotations.Test;

public class ExceptionOutTest 
{
@Test(invocationTimeOut = 200)
public void infiniteLoopTest()
{
	int i=1;
	while(i==1) {
		System.out.println(i);
	}
}
}
