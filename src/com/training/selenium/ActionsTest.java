package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * class for mouse over
 */
public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://demoqa.com/");
		// maximize the window
		driver.manage().window().maximize();
		
		WebElement mouseOver=driver.findElement(By.linkText("Contact"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseOver).build().perform();//mouse over
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
