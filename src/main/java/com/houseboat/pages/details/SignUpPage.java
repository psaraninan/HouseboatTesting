package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(SignUpPage.class.getName());
	By signUp = By.xpath("//ul[@class='auth0-lock-tabs']/li[2]");
	By fbSignUp = By.linkText("Sign up with Facebook");
	By googleSignUp = By.linkText("Sign up with Google");
	By houseboatEmail = By.id("1-email");
	By houseboatPass= By.cssSelector("input[type='password']");
	By signUpBtn = By.cssSelector("button[name='submit']");
	public SignUpPage(WebDriver driver) {
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
	public WebElement getHouseboatEmail() throws IOException {
		log.info(" sign up...");
		return driver.findElement(houseboatEmail);
	}
	public WebElement getHouseboatPassword() throws IOException {
		log.info(" sign up...");
		return driver.findElement(houseboatPass);
	}
	public WebElement pressSignUpBtn() throws IOException {
		log.info(" sign up...");
		return driver.findElement(signUpBtn);
	}
}
