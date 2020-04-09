package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static Logger log = LogManager.getLogger(LoginPage.class.getName());
	By getStarted = By.xpath("//a[@href='/partner']");
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStarted() throws IOException, InterruptedException {
		log.info("in get started..");
		Thread.sleep(2000);
		return driver.findElement(getStarted);
	}

}
