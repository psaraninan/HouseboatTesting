package com.houseboat.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import resources.DriverInitialisation;

public class InitialTest extends DriverInitialisation {
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void openUrl() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://houseboatjunction.com/");
		Thread.sleep(4000);
	}
}
