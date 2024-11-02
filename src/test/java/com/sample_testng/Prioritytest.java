package com.sample_testng;

import org.testng.annotations.Test;

public class Prioritytest {
	@Test(priority = -1)
	private void browserlaunch() {
		System.out.println("user launch the browser");
	}
	@Test(priority = 1)
	private void logout() {
		System.out.println("logout");
	}
	@Test(priority = 0)
    private void searchproduct() {
		System.out.println("watch");
	}
}
