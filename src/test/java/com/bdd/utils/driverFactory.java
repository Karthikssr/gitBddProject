package com.bdd.utils;

import org.openqa.selenium.WebDriver;

public class driverFactory {
	
	private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();	
	
	public static WebDriver getDriver() {	
		return drivers.get();
	}
	
	public static void addDriver(WebDriver driver) {	
		drivers.set(driver);
	}

}
