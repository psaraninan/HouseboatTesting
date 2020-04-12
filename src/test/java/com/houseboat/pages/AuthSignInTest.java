package com.houseboat.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.AuthSignIn;

public class AuthSignInTest extends InitialTest {
	@Test
	public void googleSignIn() throws IOException, InterruptedException {
		AuthSignIn authSignIn = new AuthSignIn(driver);
		authSignIn.getGoogleSignIn().click();
		Thread.sleep(2000);
	}
	
	
}
