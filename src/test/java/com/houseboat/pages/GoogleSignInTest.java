package com.houseboat.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.GoogleSignIn;

public class GoogleSignInTest extends InitialTest {

	@Test
	public void getEmail() throws IOException, InterruptedException {
		GoogleSignIn googleSign = new GoogleSignIn(driver);
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);

		String email = prop.getProperty("signinemail");
		String password = prop.getProperty("signinpassword");
		googleSign.getEmail().sendKeys(email);
		googleSign.getNextBtn().click();
		Thread.sleep(2000);
		googleSign.getPassword().sendKeys(password);
		googleSign.getPassNextBtn().click();
		Thread.sleep(2000);
	}
}
