package com.training.testng;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchSelect {

	WebDriver driver;

	@Test(alwaysRun = true)
	public void openChromeBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// open browser
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "openChromeBrowser")
	@Parameters({"searchName","searchFullname"})
	public void search(String searchName,String searchFullname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(searchName);
		List<WebElement> eles=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement ele:eles){
			System.out.println("element text-->"+ele.getText());
			if(ele.getText().equalsIgnoreCase(searchFullname)){
				ele.click();
				break;
			}
		}

	}
	
	

	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}

}
