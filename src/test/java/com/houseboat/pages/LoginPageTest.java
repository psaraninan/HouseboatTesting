package com.houseboat.pages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.houseboat.pages.details.HomePage;
import com.houseboat.pages.details.LoginPage;

import resources.DriverInitialisation;

public class LoginPageTest extends InitialTest {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	//public WebDriver driver;

	public LoginPage login;
	

	@Test
	public void getStarted() throws IOException, InterruptedException {
		// LoginPage login = new LoginPage(driver);
		
		login = new LoginPage(driver);;
		login.getStarted().click();
		Thread.sleep(3000);
	}
}
