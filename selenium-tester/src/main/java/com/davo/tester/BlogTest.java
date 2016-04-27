package com.davo.tester;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.davo.tester.common.WebDriverTypes;
import com.davo.tester.driver.WebDriverFactory;

/**
 * Simple Selenium test.
 * @author davo
 *
 */
public class BlogTest {
	
	private static final String BLOG_URL = "http://davosoft.blogspot.com/2016/03/web-automation-testing-with-selenium.html";
	
	private static final String SCREEN_SHOT_CAPABILITY = "takesScreenShot";
	
	private String readerName = "Davo";
	
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
		
		WebElement postCommentLink = driver.findElement(By.linkText("Post a Comment"));
		postCommentLink.click();
		
		WebElement commentField = driver.findElement(By.id("comment-body"));
		commentField.sendKeys("Hi I'm" + readerName + "  and this is a comment with Selenium.");
		commentField.submit();
		
	}

}
