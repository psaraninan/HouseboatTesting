package com.houseboat.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.AddHouseboat;

public class AddHouseboatTest extends InitialTest {
	@Test
	public void clickAddBtn() throws IOException, InterruptedException {
		AddHouseboat addHb = new AddHouseboat(driver);
		addHb.getAddBtn().click();
		Thread.sleep(2000);
	}

}
