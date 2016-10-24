package com.davo.tester.driver;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.jetty.util.Loader;
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
	private ClassLoader loader;
	
	private static final String WINDOWS_CHROME_DRIVER_PROP = "windows.chrome.driver.location";
	private static final String LINUX_CHROME_DRIVER_PROP = "linux.chrome.driver.location";
	private String CHROME_DRIVER_LOCATION;
	
	protected WebDriver driver;
	
	public ChromeWebDriverCreator() throws IOException{
		loadProperties();
		try {
			setDriverLocation();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadProperties() throws IOException{
		properties = new Properties();
		loader = Thread.currentThread().getContextClassLoader();
		InputStream in = loader.getResourceAsStream(CONFIGURATION_PROPERTIES_FILE);
		properties.load(in);
	}
	
	/**
	 * Loads system specific properties.
	 * @throws URISyntaxException 
	 * @throws IOException
	 */
	private void setDriverLocation() throws URISyntaxException{
		if(SystemUtility.isWindowsSystem()){
			URL url = loader.getResource(properties.getProperty(WINDOWS_CHROME_DRIVER_PROP));
			String loc = url.getPath();
			CHROME_DRIVER_LOCATION = loc.substring(1);
		}else{
			CHROME_DRIVER_LOCATION = properties.getProperty(LINUX_CHROME_DRIVER_PROP);
		}
	}

	/**
	 * @see WebDriverCreator
	 */
	public WebDriver createWebDriver(DesiredCapabilities capabilities) {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver(capabilities);
		return driver;
	}

}
