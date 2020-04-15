package com.houseboat.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.SignUpPage;

public class SignUpPageTest extends InitialTest{
	
	@Test
	public void houseboatSignup() throws IOException, InterruptedException {
		SignUpPage signUp = new SignUpPage(driver);
		signUp.getSignUp().click();
		Thread.sleep(3000);
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);
		String signUpEmail = prop.getProperty("signUpEmail");
		String signUpPass = prop.getProperty("signUpPass");
		signUp.getHouseboatEmail().sendKeys(signUpEmail);
		signUp.getHouseboatPassword().sendKeys(signUpPass);
		signUp.pressSignUpBtn().click();
		Thread.sleep(3000);
	}
	
	public void googleSignUp() throws IOException {
		SignUpPage auth = new SignUpPage(driver);
		auth.googleSignUp().click();
	}
	

	public void facebookSignUp() throws IOException {
		SignUpPage auth = new SignUpPage(driver);
		auth.fbSignUp();
	}
}
