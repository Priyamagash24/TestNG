package com.sample_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencytest {
	
	@Test
	private void fblaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
	}
	
	@Test(dependsOnMethods = "fblaunch")
	private void searchproduct()throws Exception {
		Thread.sleep(2000);
		System.out.println("user search the product");
	}
}
