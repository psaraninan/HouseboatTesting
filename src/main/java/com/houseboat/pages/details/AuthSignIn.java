package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthSignIn {

	WebDriver driver;
	public static Logger log = LogManager.getLogger(AuthSignIn.class.getName());
	By googleSignIn = By.linkText("Sign in with Google");
	By fbSignIn = By.linkText("Sign in with Facebook");

	public AuthSignIn(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGoogleSignIn() throws IOException {
		log.info(" sign up...");
		return driver.findElement(googleSignIn);
	}

	public WebElement getFbSignIn() throws IOException {
		log.info(" sign up...");
		return driver.findElement(fbSignIn);
	}

}
