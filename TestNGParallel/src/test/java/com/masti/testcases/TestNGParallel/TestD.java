package com.masti.testcases.TestNGParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestD {
	WebDriver driver;

	@Test
	public void Test4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test4");
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
