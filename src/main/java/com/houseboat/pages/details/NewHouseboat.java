package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewHouseboat {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(AuthSignIn.class.getName());
	By title = By.xpath("//input[@data-key='title']");
	By address = By.xpath("//input[@data-key='address']");
	By sqft = By.xpath("//input[@data-key='sqft']");
	By bedrooms = By.xpath("//input[@data-key='bedrooms']");
	By bathrooms = By.xpath("//input[@data-key='bathrooms']");
	By occupancy = By.xpath("//input[@data-key='occupancy']");

	By city = By.xpath("//select[@data-key='city']");
	By saveBtn = By.cssSelector(".button.is-link");

	public NewHouseboat(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTitle() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(title);
	}

	public WebElement getAddress() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(address);
	}

	public WebElement getSqft() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(sqft);
	}

	public WebElement getBedrooms() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(bedrooms);
	}

	public WebElement getBathrooms() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(bathrooms);
	}

	public WebElement getOccupancy() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(occupancy);
	}

	public WebElement getSelectCity() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(city);
	}
	public By getCityList() throws IOException {
		log.info("click add houseboat...");
		return (city);
	}

	public WebElement getSaveBtn() throws IOException {
		log.info("click add houseboat...");
		return driver.findElement(saveBtn);
	}
}
