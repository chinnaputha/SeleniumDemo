package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://toolsqa.com/iframe-practice-page/");
		// maximize the window
		driver.manage().window().maximize();

		// refresh page
		driver.navigate().refresh();

		// driver.switchTo().frame(1);
		// driver.switchTo().frame("iframe2");
		try {
			WebElement frameEle = driver.findElement(By.cssSelector("iframe[id='IF3467']"));
			driver.switchTo().frame(frameEle);

			driver.findElements(By.cssSelector("a[class='ui-tabs-anchor']")).get(2).click();
			Thread.sleep(4000);

			// driver.getPageSource();

			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
