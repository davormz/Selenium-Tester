package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author davo
 *
 */
public interface WebDriverCreator {
	
	WebDriver createWebDriver(DesiredCapabilities capabilities);

}
