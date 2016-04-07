package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author davo
 *
 */
public class ChromeWebDriverCreator implements WebDriverCreator {
	static final String CHROME_DRIVER = "webdriver.chrome.driver";
	static final String CHROME_DRIVER_LOCATION = "/home/davo/Documents/selenium/chromedriver";
	
	protected WebDriver driver;

	public WebDriver createWebDriver(DesiredCapabilities capabilities) {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver(capabilities);
		return driver;
	}

}
