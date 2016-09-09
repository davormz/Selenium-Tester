package com.davo.tester.util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.davo.tester.domain.Page;

public class TestPageHelper {
	
	public static File takeScreenshot(Page page){
		File screenshotAsFile = ((TakesScreenshot)page.getWebDriver()).getScreenshotAs(OutputType.FILE);
		return screenshotAsFile;
	}

}
