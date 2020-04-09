package com.houseboat.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.houseboat.pages.details.HomePage;



public class HomePageTest extends InitialTest {
	@Test
	public void homePage() throws IOException, InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.getlistForFree().click();
		Thread.sleep(2000);

	}
}
