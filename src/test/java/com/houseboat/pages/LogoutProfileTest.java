package com.houseboat.pages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.houseboat.pages.details.HomePage;
import com.houseboat.pages.details.LogoutProfile;

public class LogoutProfileTest extends InitialTest {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	// public WebDriver driver;

	LogoutProfile logout;

	@Test
	public void logout() throws IOException, InterruptedException {
		// LoginPage login = new LoginPage(driver);

		logout = new LogoutProfile(driver);
		logout.getLogout().click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void cleanUp() {
		driver.close();
	}
}
