package com.training.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		// maximize the window
		driver.manage().window().maximize();

		//get current/parent window id
		String parent_id=driver.getWindowHandle();
		//click link 
		driver.findElement(By.cssSelector("button[id='button1']")).click();
		Thread.sleep(4000);
		
		Set<String> tot_windows=driver.getWindowHandles();
		
		for(String childWindow:tot_windows){
			if(!childWindow.equals(parent_id)){
				//switch to child window
				driver.switchTo().window(childWindow);
				driver.findElement(By.cssSelector("a[class='dt-mobile-menu-icon']")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_id);
		
		driver.quit();
		
		

	}

}
