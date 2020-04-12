package com.houseboat.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import resources.DriverInitialisation;

public class InitialTest extends DriverInitialisation {
	static WebDriver driver = null;
	
	@BeforeTest
	public void openUrl() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://houseboatjunction.com/");
		Thread.sleep(4000);
	}
}
