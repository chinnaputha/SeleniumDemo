package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumWebDriver2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		// maximize the window
		driver.manage().window().maximize();

		//driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		WebElement searchEle=driver.findElement(By.id("lst-ib"));
		searchEle.sendKeys("java");
		
		driver.findElement(By.id("_fZl")).click();
		Thread.sleep(2000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links available in page-->"+links.size());
		
		String firstLinkAttribute=links.get(0).getAttribute("href");
		System.out.println("first link attribute value-->"+firstLinkAttribute);
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
