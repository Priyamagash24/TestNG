package com.sample_testng;

import org.testng.annotations.Test;

public class Grouping_test {
	@Test(groups = "mobile",dependsOnGroups = "laptop")
	private void samsung() {
		System.out.println("samsung galaxy s24");
		}
	@Test(groups = "mobile",dependsOnGroups = "laptop")
	private void iphone() {
		System.out.println("iphone 13");
	}
	@Test(groups = "mobile",dependsOnGroups = "laptop")
    private void poco() {
	System.out.println("poco M6 pro");	
	}
	@Test(groups = "laptop")
    private void asus() {
		System.out.println("asus vivobook 15");
	}
	@Test(groups = "laptop")
    private void hp() {
		System.out.println("hp pavillion");
	}
	@Test(groups = "laptop")
    private void apple() {
		System.out.println("apple macbook");
	}
}
