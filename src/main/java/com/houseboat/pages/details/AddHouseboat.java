package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddHouseboat {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(AddHouseboat.class.getName());
	By addButton = By.cssSelector(".title.is-4");

	public AddHouseboat(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAddBtn() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(addButton);
	}
}
