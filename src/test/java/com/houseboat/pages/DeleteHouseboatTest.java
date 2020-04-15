package com.houseboat.pages;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.houseboat.pages.details.DeleteHouseboat;

public class DeleteHouseboatTest extends InitialTest {
	@Test
	public void deleteHouseboat() throws IOException, InterruptedException {
		DeleteHouseboat deleteHb = new DeleteHouseboat(driver);
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);

		String deleteHouseboat = prop.getProperty("boatToDelete");
		System.out.println("Boat to delete:" + deleteHouseboat);
		List<WebElement> boatList = deleteHb.getHouseboatList();
		System.out.println("number of houseboats:" + (boatList.size()-1));
		for (int i = 0; i < boatList.size()-1; i++) {
			// dThread.sleep(2000);
			System.out.println("value of i:" + i);
			String[] name = boatList.get(i).getText().split("Pending");
			String hbName = name[0].trim();
			System.out.println("boats list, boat name:" + hbName);
			// String formattedName = name[0].trim();
			if (hbName.equalsIgnoreCase(deleteHouseboat)) {
				System.out.println(hbName+" will be deleted");
				List<WebElement> deleteButtonsList = driver
						.findElements(By.cssSelector(".button.is-danger.button-padding"));
				deleteButtonsList.get(i).click();
				//WebDriverWait wait = new WebDriverWait(driver,50);
				//wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".button.is-danger"))));
				//wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".button"))));
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Delete Houseboat')]")));
				//WebElement confirmDelete = driver.findElement(By.xpath("//button[contains(text(),'Delete Houseboat')]"));
				
				//Actions action = new Actions(driver);
				//action.moveToElement(confirmDelete).click().perform() ;
				//WebElement modalContainer=driver.findElement(By.className("modal-card"));
				//WebElement modalContent= modalContainer.findElement(By.cssSelector(".button.is-danger"));
				//modalContent.click();
				Thread.sleep(3000);
				WebElement modal =driver.findElement(By.cssSelector(".modal.is-active"));
				WebElement modalChild=modal.findElement(By.xpath(".//button[contains(text(),'Delete Houseboat')]"));
				modalChild.click();
				//driver.switchTo().activeElement();
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Delete Houseboat')]")));
				//confirmDelete.click();
				/*String modalHead=driver.findElement(By.className("modal-card")).getText();
				String modalTitle=driver.findElement(By.className("modal-card-title")).getText();
				String modalFoot=driver.findElement(By.className("modal-card-foot")).getText();
				System.out.println("modal head:" +modalHead);
				System.out.println("modal title:" +modalTitle);
				System.out.println("modal foot:" +modalFoot);
				driver.findElement(By.cssSelector(".button.is-danger")).click();
				*/
				System.out.println("confirm delete clicked..");
				Thread.sleep(2000);
				break;
			}
		}

	}
}
