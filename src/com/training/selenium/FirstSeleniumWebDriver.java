package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		// maximize the window
		driver.manage().window().maximize();

		// get page title
		String pageTitle = driver.getTitle();
		System.out.println("PAGE TITLE-->" + pageTitle);

		// get page current url
		String pageURL = driver.getCurrentUrl();
		System.out.println("PAGEURL-->" + pageURL);
		
		//validate Page url contains Google
		if(pageURL.contains("google")){
			System.out.println("URL contains google");
		}
		
		// get page Source
		String pageSoure = driver.getPageSource();
	//	System.out.println("PAGE SOURE-->" + pageSoure);

		Thread.sleep(3000);

		// close the browser
		driver.quit();

	}

}
