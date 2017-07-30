package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * class for mouse over
 */
public class JavaScriptOperationsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("https://www.hdfc.com/");
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver
				.findElement(By.cssSelector("section[id='block-menu-menu-footer-menu'] a[href='/form-centre']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", ele); //scroll the page upto element
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", ele);//click by javascript

		String sText = js.executeScript("return document.title;").toString(); // get the page title by using javascript

		System.out.println("page title-->" + sText);

		Thread.sleep(4000);

	}

}
