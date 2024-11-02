package com.sample_testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotation {
	@BeforeSuite
	private void browserlaunch() {
		System.out.println("user going to lauvh the browser");
	}
	@BeforeTest
   private void urllaunch() {
	System.out.println("url launch");
}
	@BeforeClass
   private void login() {
	System.out.println("login");
}
	@BeforeMethod
   private void searchproduct() {
 System.out.println("iphone");	
}
	@Test
   private void selectproduct() {
	System.out.println("product selected");
}
	@AfterMethod
   private void buyproduct() {
	System.out.println("product added to cart");
}	
	

}
