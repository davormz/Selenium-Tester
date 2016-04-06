package com.davo.tester.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.common.WebDriverTypes;

/**
 * 
 * @author davo
 *
 */
public class WebDriverFactory {
	
	public static WebDriver getWebDriver(WebDriverTypes driverType, DesiredCapabilities capabilities){
		WebDriver driver = null;
		WebDriverCreator creator = null;
		if(driverType.equals(WebDriverTypes.FIRE_FOX)){
			creator = new FireFoxWebDriverCreator();
			driver = creator.createWebDriver(capabilities);
		}
		
		return driver;
	}
	
}
