package com.training.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchSelectUsingKeyboardEvents {

	WebDriver driver;

	@Test(alwaysRun = true)
	public void openFFBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "openFFBrowser")
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		Thread.sleep(4000);
		String keyboardEvents = Keys.chord(Keys.CONTROL, "a", Keys.DELETE);

		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(keyboardEvents);
		Thread.sleep(4000);
		driver.close();

	}

}
