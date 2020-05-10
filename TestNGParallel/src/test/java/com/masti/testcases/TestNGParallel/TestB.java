package com.masti.testcases.TestNGParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestB {
	WebDriver driver;

	@Test
	public void Test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test2");
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
