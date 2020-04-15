package com.houseboat.pages.details;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteHouseboat {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(DeleteHouseboat.class.getName());

	public DeleteHouseboat(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getHouseboatList() throws IOException, InterruptedException {
		log.info("delete houseboat...");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.className("card-content"))));
		List<WebElement> houseboatList = driver.findElements(By.className("card-content"));
		System.out.println("number of houseboats : "+houseboatList.size());
		return houseboatList;
	}
}
