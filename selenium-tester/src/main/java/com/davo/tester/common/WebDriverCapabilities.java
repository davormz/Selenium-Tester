package com.davo.tester.common;

public enum WebDriverCapabilities {
	SCREEN_SHOT_CAPABILITY("takesScreenShot");
	
	WebDriverCapabilities(String capabilityName){
		this.capabilityName = capabilityName;
	}
	
	private String capabilityName;

	public String getCapabilityName() {
		return capabilityName;
	}
	
}
