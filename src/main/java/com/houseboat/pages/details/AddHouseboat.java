package com.houseboat.pages.details;

import java.io.IOException;
import java.util.List;

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
		List<WebElement> addList = driver.findElements(By.cssSelector(".title.is-4"));
		for (int i=0;i<addList.size();i++) {
			if (addList.get(i).getText().contains("Add new houseboat")){
				return addList.get(i);
			}
			break;
		}
		return driver.findElement(addButton);
	}
}
