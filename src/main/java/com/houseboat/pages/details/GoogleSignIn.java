package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSignIn {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(AuthPage.class.getName());
	By email = By.id("identifierId");
	// By next = By.linkText("Next");\
	By next = By.id("identifierNext");
	By password = By.name("password");
	By passNextBtn = By.cssSelector(".RveJvd.snByac");

	public GoogleSignIn(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() throws IOException {
		log.info("google sign in: email......");
		return driver.findElement(email);
	}

	public WebElement getNextBtn() throws IOException {
		log.info("google sign in: next......");
		return driver.findElement(next);
	}

	public WebElement getPassword() throws IOException {
		log.info("google sign in: next......");
		return driver.findElement(password);
	}
	public WebElement getPassNextBtn() throws IOException {
		log.info("google sign in: next......");
		return driver.findElement(passNextBtn);
	}
}
