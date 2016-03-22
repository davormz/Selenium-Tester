package com.davo.tester;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.common.WebDriverTypes;
import com.davo.tester.driver.WebDriverFactory;

public class BlogTest {
	
	private static final String BLOG_URL = "http://davosoft.blogspot.com/";
	
	static final String SCREEN_SHOT_CAPABILITY = "takesScreenShot";
	
	protected Map<String, Boolean> capabilitiesMap;
	
	private WebDriver driver;
	
	public BlogTest(){
		capabilitiesMap = new HashMap<String, Boolean>();
		capabilitiesMap.put(SCREEN_SHOT_CAPABILITY, true);
		
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		
		driver = WebDriverFactory.getWebDriver(WebDriverTypes.FIRE_FOX, capabilities);
		
	}
	
	public void testBlogEntrance(){
		driver.get(BLOG_URL);
		
		WebElement seleniumArticleLink = driver.findElement(By.linkText("Web automation testing with Selenium"));
		seleniumArticleLink.click();
		
		
	}

}
