package com.training.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItTest {
	
	@Test
	public void fileUpload() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://www.tinyupload.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='uploaded_file']")).click();
		Thread.sleep(4000);
		
		
		// maximize the window
		Runtime.getRuntime().exec("src\\autoit\\FileuploadAutoIt.exe");
		
	//	driver.findElement(By.cssSelector("input[name='uploaded_file']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		Thread.sleep(4000);
		
		driver.close();
	}

}
