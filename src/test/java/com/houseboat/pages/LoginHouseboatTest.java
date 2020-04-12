package com.houseboat.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.LoginHouseboat;

public class LoginHouseboatTest extends InitialTest {
	@Test
	public void hbLogin() throws IOException, InterruptedException {
		LoginHouseboat login = new LoginHouseboat(driver);
		login.getEmail().sendKeys("psara@priyanka.com");
		login.getPassword().sendKeys("Abcd1234");
		login.getLoginButton().click();
		Thread.sleep(3000);
	}
}
