package com.sample_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider_test {
	static WebDriver driver;
	@BeforeClass
	private void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
	}
	
	@Test(dataProvider = "userdetails")
    private void login(String a,String b) {
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		driver.findElement(By.name("login")).click();
	}
	//object[][]
	@DataProvider
	private Object[][] userdetails() {
		return new Object[][] {
			{"priya" ,"asdfg"},
			{"magash", "kutty"}
		};
	}

}
