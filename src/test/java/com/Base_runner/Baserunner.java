package com.Base_runner;

import java.io.IOException;

import com.Base_class.Baseclass;

public class Baserunner extends Baseclass{
	public static void main(String[] args) throws IOException {
		browserlaunch();
		urllaunch("https://www.facebook.com/index.php/");
		takesc("fb.png");
		close();
	}

}
