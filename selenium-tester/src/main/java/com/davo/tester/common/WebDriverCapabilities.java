package com.davo.tester.common;

public enum WebDriverCapabilities {
	BROWSER_NAME("browserName"),
	BROWSER_VERSION("version"),
	SYSTEM_PLATFORM("platform"),
	SCREEN_SHOT_CAPABILITY("takesScreenShot"),
	HANDLES_ALERTS("handlesAlerts"), 
	UNEXPECTED_ALERT_BEHAIVOR("unexpectedAlertBehaviour");
	
	WebDriverCapabilities(String capabilityName){
		this.capabilityName = capabilityName;
	}
	
	private String capabilityName;

	public String getCapabilityName() {
		return capabilityName;
	}
	
}
