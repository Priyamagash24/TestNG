package com.sample_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowsertest {
	@Test
	private void chromedriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
	}
	@Test
	private void internet_explorer() {
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/index.php/");
	}
}
