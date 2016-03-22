package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface WebDriverCreator {
	
	WebDriver createWebDriver(DesiredCapabilities capabilities);

}
