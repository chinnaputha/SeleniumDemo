package com.training.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormUsingSelect {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UC202376/git/NewGit/1p-ui-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("http://demoqa.com/registration/");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name_3_firstname")).sendKeys("java");
		driver.findElement(By.id("name_3_lastname")).sendKeys("selenium");
		
		driver.findElement(By.cssSelector("input[value=married]")).isDisplayed();
		
		WebElement selEle=driver.findElement(By.cssSelector("select[id^='dropdown_']"));
		
		Select ses = new Select(selEle);
		ses.selectByVisibleText("Algeria");// using visible text
		//ses.selectByIndex(3);// uisng index
		//ses.selectByValue("Angola");
		Thread.sleep(2000);
		String selectedText=ses.getFirstSelectedOption().getText();
		System.out.println("selected Text-->"+selectedText);
		
		List<String> countries = new ArrayList<String>();
		
		List<WebElement> allCountries = ses.getOptions();
		
		/*for(WebElement country:allCountries){
			countries.add(country.getText());
		}*/
		
		
		for(WebElement country:allCountries){
			if(country.getText().contains("Barbuda")){
				country.click();
				break;
			}
		}
		
		System.out.println("list of countries-->"+countries);
		
		if(!countries.contains("Algfefa")){
			throw new Exception("Algfefa country not present in country list");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
