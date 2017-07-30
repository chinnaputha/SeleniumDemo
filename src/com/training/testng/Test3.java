package com.training.testng;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void login(){
		int c=1/0;
		System.out.println("Test2.sampleTest()1");
	}
	
	
	@Test(dependsOnMethods="login")
	public void composemail(){
		System.out.println("Test2.sampleTest()2");
	}
	
	@Test(dependsOnMethods="composemail")
	public void logout(){
		System.out.println("Test2.sampleTest()3");
	}
	
	
}
