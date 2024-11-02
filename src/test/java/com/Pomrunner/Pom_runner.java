package com.Pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Pomclass.Pom_class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_runner  {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/index.php/");
	Pom_class p=new Pom_class(driver);
	WebElement user = p.getUser();
	user.sendKeys("priya");
}
}
