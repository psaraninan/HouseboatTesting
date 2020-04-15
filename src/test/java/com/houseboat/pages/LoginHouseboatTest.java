package com.houseboat.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import com.houseboat.pages.details.LoginHouseboat;

public class LoginHouseboatTest extends InitialTest {
	@Test
	public void hbLogin() throws IOException, InterruptedException {
		LoginHouseboat login = new LoginHouseboat(driver);
		//login.getEmail().sendKeys("psara@priyanka.com");
		//login.getPassword().sendKeys("Abcd1234");
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);
		String signinEmail = prop.getProperty("signUpEmail");
		String signinPass = prop.getProperty("signUpPass");
		login.getEmail().sendKeys(signinEmail);
		login.getPassword().sendKeys(signinPass);
		login.getLoginButton().click();
		Thread.sleep(3000);
	}
}
