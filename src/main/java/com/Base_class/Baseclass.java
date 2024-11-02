package com.Base_class;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static WebDriver driver;
public  static void browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
}
public static void urllaunch(String e) {
	driver.get(e);
}
public static void takesc(String s) throws IOException {
	TakesScreenshot t =(TakesScreenshot)driver ;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	File fol=new File("C:\\Users\\PC Corner\\Desktop\\TestNg\\target"+s);
FileHandler.copy(screenshotAs,fol);
}
public static void close() {
	driver.close();
	
}
}
