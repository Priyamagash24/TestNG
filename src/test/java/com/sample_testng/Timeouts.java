package com.sample_testng;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;




public class Timeouts  {
	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	private void fb_url_launch() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("url launched");
	}

}
