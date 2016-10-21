package com.davo.tester.driver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.common.WebDriverCapabilities;
import com.davo.tester.common.WebDriverTypes;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class WebDriverFactoryTest {
	
	protected Map<String, Boolean> capabilitiesMap;
	
//	@Test
//	public void createFireFoxWebDriver(){
//		
//		capabilitiesMap = new HashMap<String, Boolean>();
//		capabilitiesMap.put(WebDriverCapabilities.SCREEN_SHOT_CAPABILITY.getCapabilityName(), true);
//		
//		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
//		
//		WebDriver driver = WebDriverFactory.getWebDriver(WebDriverTypes.FIRE_FOX, capabilities);
//		
//		assertNotNull(driver);
//		assertTrue(driver instanceof FirefoxDriver);
//		
//		
//	}
	
	@Test
	public void createChromeWebDriver(){
		//TODO: update test.
		capabilitiesMap = new HashMap<String, Boolean>();
		capabilitiesMap.put(WebDriverCapabilities.SCREEN_SHOT_CAPABILITY.getCapabilityName(), true);
		
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		
		WebDriver driver = WebDriverFactory.getWebDriver(WebDriverTypes.CHROME, capabilities);
		
		assertNotNull(driver);
		assertTrue(driver instanceof ChromeDriver);
		
		
	}

}
