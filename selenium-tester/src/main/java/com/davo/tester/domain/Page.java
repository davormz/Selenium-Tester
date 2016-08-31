package com.davo.tester.domain;

import org.openqa.selenium.WebDriver;

/**
 * This class helps to the Page Object implementation.
 * @author davo
 *
 */
public abstract  class Page {
	
	protected WebDriver webDriver;
	
	public Page(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void open(String url){
		webDriver.get(url);
	}
	
	public String getTitle(){
		return webDriver.getTitle();
	}
	
	public void close(){
		webDriver.quit();
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
}
