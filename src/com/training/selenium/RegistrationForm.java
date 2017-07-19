package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://demoqa.com/registration/");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name_3_firstname")).sendKeys("java");
		driver.findElement(By.id("name_3_lastname")).sendKeys("selenium");
		
		boolean marialStatus=driver.findElement(By.cssSelector("input[value=married]")).isDisplayed();
		
		if(marialStatus){
			boolean marialStatusEnabled=driver.findElement(By.cssSelector("input[value=married]")).isEnabled();
			
			if(marialStatusEnabled){
				boolean selected=driver.findElement(By.cssSelector("input[value=married]")).isSelected();
				
				if(!selected){
					driver.findElement(By.cssSelector("input[value=married]")).click();
				}
				
			}
		}
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
