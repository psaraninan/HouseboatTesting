package com.houseboat.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.houseboat.pages.details.AddHouseboat;
import com.houseboat.pages.details.NewHouseboat;

public class NewHouseboatTest extends InitialTest {
	@Test
	public void addNewHouseboat() throws IOException, InterruptedException {
		NewHouseboat newHb = new NewHouseboat(driver);
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);

		String title = prop.getProperty("title");
		String address=prop.getProperty("address");
		String city=prop.getProperty("city");
		String squarefeet=prop.getProperty("squarefeet");
		String beds=prop.getProperty("bedrooms");
		String baths=prop.getProperty("bathrooms");
		String occupancy=prop.getProperty("occupancy");
		
		newHb.getTitle().sendKeys(title);
		newHb.getAddress().sendKeys(address);
		newHb.getSqft().sendKeys(squarefeet);
		newHb.getBedrooms().sendKeys(beds);
		newHb.getBathrooms().sendKeys(baths);
		newHb.getOccupancy().sendKeys(occupancy);
		
		newHb.getSelectCity().click();
		Select selectCity = new Select(driver.findElement(newHb.getCityList()));
		selectCity.selectByVisibleText(city);
		newHb.getSaveBtn().click();
		Thread.sleep(2000);
	}
	
	
}
