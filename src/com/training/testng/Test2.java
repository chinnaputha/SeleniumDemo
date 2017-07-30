package com.training.testng;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=1)
	public void sampleTest(){
		System.out.println("Test2.sampleTest()1");
	}
	
	
	@Test(priority=2)
	public void sampleTest2(){
		System.out.println("Test2.sampleTest()2");
	}
	
	@Test(priority=0,invocationCount=10)
	public void sampleTest3(){
		System.out.println("Test2.sampleTest()3");
	}
	
	
}
