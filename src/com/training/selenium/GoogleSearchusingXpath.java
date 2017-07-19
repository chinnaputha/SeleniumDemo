package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchusingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		// maximize the window
		driver.manage().window().maximize();

		//driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		WebElement searchEle=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		searchEle.sendKeys("java");
		
		driver.findElement(By.xpath("//button[@name='btnG']")).click();
	}

}
