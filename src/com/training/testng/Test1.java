package com.training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Test1.beforeClass()");
	}
	
	@BeforeMethod
	public void beforMethod(){
		System.out.println("Test1.beforMethod()");
	}
	
	@Test
	public void method1(){
		System.out.println("Test1.method1()");
	}
	
	@Test
	public void method2(){
		System.out.println("Test1.method2()");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Test1.afterMethod()");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Test1.afterClass()");
	}
}
