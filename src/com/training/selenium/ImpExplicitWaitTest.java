package com.training.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * class for mouse over
 */
public class ImpExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait

		driver.findElement(By.cssSelector("a[title='Google apps']")).click();

		
		WebDriverWait wait = new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("div[aria-label='Google apps'] a[href='https://mail.google.com/mail/?tab=wm']"))));
		
		driver.findElement(By.cssSelector("div[aria-label='Google apps'] a[href='https://mail.google.com/mail/?tab=wm']")).click();
	  	
		
		driver.close();

	}

}
