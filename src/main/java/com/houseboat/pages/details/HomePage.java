package com.houseboat.pages.details;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	public static Logger log =LogManager.getLogger(HomePage.class.getName());

	By listForFree = By.xpath("//a[@href='/partner-with-us']");
			//By.linkText("Login");
	By titleCourse = By.xpath("//section[@id='content']/div/div/h2");
	By navBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	By headerData= By.xpath("//div[@class='col-sm-6.col-md-8.hidden-xs.video-banner']/h3");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getlistForFree() throws IOException {
		log.info("get list for free...");
		return driver.findElement(listForFree);
	}
	
	public WebElement getTitle() throws IOException {
		log.info("get title..");
		return driver.findElement(titleCourse);
	}
	public WebElement getNavbar() throws IOException {
		log.info("get navbar...");
		return driver.findElement(navBar);
	}
	public WebElement getHeaderData() throws IOException {
		log.info("get header data...");
		return driver.findElement(headerData);
	}

}
