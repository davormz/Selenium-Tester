package com.davo.tester.driver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	private static final String CONFIGURATION_PROPERTIES_FILE = "config.properties";
	
	private Properties properties;
	
	//TODO: Abstract the location of the driver.
	private static final String WINDOWS_CHROME_DRIVER_PROP = "windows.chrome.driver.location";
	private static final String LINUX_CHROME_DRIVER_PROP = "linux.chrome.driver.location";
	private static String WINDOWS_CHROME_DRIVER_LOCATION;
	private static String LINUX_CHROME_DRIVER_LOCATION;
	
	protected WebDriver driver;
	
	public ChromeWebDriverCreator() throws IOException{
		properties = new Properties();
		InputStream in = ChromeWebDriverCreator.class.getResourceAsStream(CONFIGURATION_PROPERTIES_FILE);
		properties.load(in);
		LINUX_CHROME_DRIVER_LOCATION = properties.getProperty(LINUX_CHROME_DRIVER_PROP);
		WINDOWS_CHROME_DRIVER_LOCATION = properties.getProperty(WINDOWS_CHROME_DRIVER_PROP);
	}

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
