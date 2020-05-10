package com.masti.testcases.TestNGParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestA {
	WebDriver driver;

	@Test
	public void Test1() {
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test1");
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
