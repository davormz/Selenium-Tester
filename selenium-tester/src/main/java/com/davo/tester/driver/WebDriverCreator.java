package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This interface defines how to create a web driver.
 * @author davo
 * This is a factory method implementation.
 */
public interface WebDriverCreator {
	
	/**
	 * 
	 * @param capabilities
	 * @return WebDriver - The specific WebDriver; it could be FireFox, Chrome or IE.
	 */
	WebDriver createWebDriver(DesiredCapabilities capabilities);

}
