package com.houseboat.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.AuthPage;

public class AuthPageTest extends InitialTest{
	@Test
	public void signUp() throws IOException, InterruptedException {
		AuthPage auth = new AuthPage(driver);
		auth.getSignUp().click();
		Thread.sleep(2000);
	}
	
	@Test
	public void googleSignUp() throws IOException {
		AuthPage auth = new AuthPage(driver);
		auth.googleSignUp().click();
	}
	
	@Test
	public void facebookSignUp() throws IOException {
		AuthPage auth = new AuthPage(driver);
		auth.fbSignUp();
	}
}
