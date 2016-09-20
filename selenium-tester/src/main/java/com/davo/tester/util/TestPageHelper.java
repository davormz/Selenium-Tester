package com.davo.tester.util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.davo.tester.domain.Page;

/**
 * This class helps with extra functionality performing the tests.
 * @author d.ramirez.ledesma
 *
 */
public class TestPageHelper {
	
	/**
	 * Takes a screenshot of the page.
	 * @param page
	 * @return File - File representation of the screenshot.
	 */
	public static File takeScreenshot(Page page){
		File screenshotAsFile = ((TakesScreenshot)page.getWebDriver()).getScreenshotAs(OutputType.FILE);
		return screenshotAsFile;
	}

}
