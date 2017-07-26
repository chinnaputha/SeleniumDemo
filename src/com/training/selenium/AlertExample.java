package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		// maximize the window
		driver.manage().window().maximize();

		
			WebElement alert = driver.findElement(By.cssSelector("button[onclick='newAlert()']"));
			alert.click();
			
			//handle alert
			Alert al=driver.switchTo().alert();	
			
			String alertText=al.getText();
			System.out.println("alert text-->"+alertText);
			Thread.sleep(4000);
			
			al.accept();
			
			Thread.sleep(4000);
			
			alert.click();
			
			driver.close();
			
	}
			
}
