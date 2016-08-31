package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.util.SystemUtility;

/**
 * This class implements the WebDriverCreator in order to instantiate a Chrome WebDriver.
 * @author davo
 *
 */
public class ChromeWebDriverCreator implements WebDriverCreator {
	static final String CHROME_DRIVER = "webdriver.chrome.driver";
	
	//TODO: Abstract the location of the driver.
	private static final String WINDOWS_CHROME_DRIVER_LOCATION = "resources/drivers/chromedriver.exe";
	private static final String LINUX_CHROME_DRIVER_LOCATION = "resources/drivers/chromedriver";
	
	protected WebDriver driver;

	/**
	 * @see WebDriverCreator
	 */
	public WebDriver createWebDriver(DesiredCapabilities capabilities) {
		if(SystemUtility.isWindowsSystem()){
			System.setProperty(CHROME_DRIVER, WINDOWS_CHROME_DRIVER_LOCATION);
		}else{
			System.setProperty(CHROME_DRIVER, LINUX_CHROME_DRIVER_LOCATION);
		}
		
		driver = new ChromeDriver(capabilities);
		return driver;
	}

}
