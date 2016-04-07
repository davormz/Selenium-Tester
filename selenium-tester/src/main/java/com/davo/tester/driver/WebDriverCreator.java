package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This interface defines how to create a web driver.
 * @author davo
 *
 */
public interface WebDriverCreator {
	
	WebDriver createWebDriver(DesiredCapabilities capabilities);

}
