package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutProfile {

	public static Logger log = LogManager.getLogger(LogoutProfile.class.getName());
	By logout = By.partialLinkText("Logout");
	public WebDriver driver;

	public LogoutProfile(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogout() throws IOException, InterruptedException {
		log.info("logout..");
		Thread.sleep(2000);
		return driver.findElement(logout);
	}
}
