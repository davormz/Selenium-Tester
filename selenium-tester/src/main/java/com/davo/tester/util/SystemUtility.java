package com.davo.tester.util;

/**
 * 
 * @author davo
 *
 */
public class SystemUtility {
	
	private static String OS_NAME_PROPERTY = "os.name";
	
	private static String WINDOWS_NAME = "Windows";
	
	/**
	 * 
	 * @return true if the host is windows.
	 */
	public static boolean isWindowsSystem(){
		return System.getProperty(OS_NAME_PROPERTY).startsWith(WINDOWS_NAME);
	}
	
	

}
