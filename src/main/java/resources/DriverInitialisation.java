package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInitialisation {

	public WebDriver driver; 
	public Properties prop = new Properties();
	public FileInputStream fileInput;
	public static Logger log = LogManager.getLogger(DriverInitialisation.class.getName());

	public WebDriver initializeDriver() throws IOException {
		
		fileInput = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\resources\\data.properties");
		prop.load(fileInput);

		String browserName = prop.getProperty("browser");// reads from file

		// String browserName = System.getProperty("browser");//reads from command.

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}

			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("internet explorer")) {

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenshot(String testName) throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		log.info("screenshot internal file generated.");
		System.out.println("testname :" + testName);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\priyanka\\Project\\Screenshots\\" + testName + ".png"));
		log.info("screenshot local file created.");
		log.error("screenshot error");
	}

}
