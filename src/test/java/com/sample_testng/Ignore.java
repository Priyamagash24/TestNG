package com.sample_testng;

import org.testng.annotations.Test;

public class Ignore {
	@Test
	private void flipkart() {
		System.out.println("user login");
	}
	//@org.testng.annotations.Ignore
    private void add() {
	System.out.println("ad popup");
}
	@Test(enabled = false)
    private void productsearch() {
		System.out.println("mobile");
	}
}
