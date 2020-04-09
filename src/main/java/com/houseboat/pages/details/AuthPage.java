package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(AuthPage.class.getName());
	By signUp = By.linkText("Sign Up");
	By fbSignUp = By.linkText("Sign up with Facebook");
	By googleSignUp = By.linkText("Sign up with Google");

	public AuthPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignUp() throws IOException {
		log.info(" sign up...");
		return driver.findElement(signUp);
	}
	public WebElement googleSignUp() throws IOException {
		log.info(" sign up...");
		return driver.findElement(googleSignUp);
	}
	public WebElement fbSignUp() throws IOException {
		log.info(" sign up...");
		return driver.findElement(fbSignUp);
	}
}
