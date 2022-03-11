package com.sevenMind.testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.sevenMind.utilities.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	
	ReadConfig readConfig = new ReadConfig();
	public static Logger logger; 
	
	public static AppiumDriver driver=null;

	@BeforeClass
	public void setup() throws MalformedURLException {
		BasicConfigurator.configure();
		logger = Logger.getLogger("7Mind");
		
		DesiredCapabilities  capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", readConfig.getAutomationName());
		capabilities.setCapability("platformName", readConfig.getPlatformName());
		capabilities.setCapability("platformVersion", readConfig.getPlatformVersion());
		capabilities.setCapability("deviceName", readConfig.getDeviceName());
		capabilities.setCapability("appPackage",readConfig.getAppPackage());
		capabilities.setCapability("appActivity", readConfig.getAppActivity());
		driver = new AndroidDriver(new URL(readConfig.gethubURL()), capabilities);
	
	}

	
	@AfterClass
	public void tearDown() {
		if(driver != null) 
			{driver.quit();}
	}

}
