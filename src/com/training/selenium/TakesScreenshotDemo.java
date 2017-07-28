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
public class TakesScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(4000);

		File myImg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("user dir-->" + System.getProperty("user.dir"));
		String myP1 = System.getProperty("user.dir") + "/screenshots/" + "myImage1.jpg";
		FileUtils.copyFile(myImg, new File(myP1));

		driver.findElement(By.cssSelector("input#lst-ibafadsfasd")).sendKeys("Hello");
		File myImg2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String myP2 = System.getProperty("user.dir") + "/screenshots/" + "myImage2.jpg";
		FileUtils.copyFile(myImg2, new File(myP2));

		
		driver.close();

	}

}
