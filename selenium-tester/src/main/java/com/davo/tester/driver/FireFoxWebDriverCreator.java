package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxWebDriverCreator implements WebDriverCreator {
	protected WebDriver driver;

	public WebDriver createWebDriver(DesiredCapabilities capabilities) {
		driver = new FirefoxDriver(capabilities);
		return driver;
	}

}
