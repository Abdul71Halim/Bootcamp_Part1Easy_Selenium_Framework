package com.QAframework_VerifyTitle_EasyPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_TitleOf_ThePage_EasyPart1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}
	
	@Test
	public void validationOfTitle() {
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://www.rediff.com/";
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		
		if( actualUrl.equals(expectedUrl) && (actualTitle.equals(expectedTitle))) {
			
	    System.out.println("This webpage is correct");  
			
		} else {System.out.println("This Webpage is incorrect");}
			
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
