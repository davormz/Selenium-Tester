package com.davo.tester.driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.common.WebDriverTypes;

/**
 * This class takes care of the specific WebDriver instantiation.
 * @author davo
 *
 */
public class WebDriverFactory {
	
	/**
	 * Based on the web driver type and the capabilities this method return an instance of the WebDriver.
	 * @param driverType
	 * @param capabilities
	 * @return WebDriver
	 */
	public static WebDriver getWebDriver(WebDriverTypes driverType, DesiredCapabilities capabilities){
		WebDriver driver = null;
		WebDriverCreator creator = null;
		if(driverType.equals(WebDriverTypes.FIRE_FOX)){
			creator = new FireFoxWebDriverCreator();
			driver = creator.createWebDriver(capabilities);
		}
		if(driverType.equals(WebDriverTypes.CHROME)){
			try {
				creator = new ChromeWebDriverCreator();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver = creator.createWebDriver(capabilities);
		}
		
		return driver;
	}
	
}
