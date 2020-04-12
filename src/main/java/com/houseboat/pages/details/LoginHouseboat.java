package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHouseboat {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(LoginHouseboat.class.getName());
	By email = By.id("1-email");
	// By next = By.linkText("Next");\
	By pass = By.xpath("//input[@name='password']");
	By loginBtn = By.className("auth0-label-submit");

	public LoginHouseboat(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() throws IOException {
		log.info("sign in: email......");
		return driver.findElement(email);
	}

	public WebElement getPassword() throws IOException {
		log.info("sign in: password......");
		return driver.findElement(pass);
	}
	public WebElement getLoginButton() throws IOException {
		log.info("sign in: login button......");
		return driver.findElement(loginBtn);
	}
}
