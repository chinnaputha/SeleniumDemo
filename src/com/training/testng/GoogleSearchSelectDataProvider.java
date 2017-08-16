package com.training.testng;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchSelectDataProvider {

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

	@Test(dependsOnMethods = "openChromeBrowser",dataProvider="getData")
	public void search(String searchName,String searchFullname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).clear();
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
	
	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[4][2];

	// 1st row
	data[0][0] ="sel";
	data[0][1] = "Selenium";

	// 2nd row
	data[1][0] ="Ja";
	data[1][1] = "Java";
	
	// 3rd row
	data[2][0] ="py";
	data[2][1] = "python";
	
	// 4th row
	data[3][0] ="ru";
	data[3][1] = "ruby";

	return data;
	}

	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}

}
