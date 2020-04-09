package com.houseboat.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.GoogleSignIn;

public class GoogleSignInTest extends InitialTest {

	@Test
	public void getEmail() throws IOException, InterruptedException {
		GoogleSignIn googleSign = new GoogleSignIn(driver);
		googleSign.getEmail().sendKeys("shajijohnofficial@gmail.com");
		googleSign.getNextBtn().click();
		Thread.sleep(2000);
	}
}
