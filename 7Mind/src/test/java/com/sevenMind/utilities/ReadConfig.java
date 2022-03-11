package com.sevenMind.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	public ReadConfig() {
		File src= new File("./Configurations/config.properties");
	
	try {
		FileInputStream fis = new FileInputStream(src);
		properties =new Properties();
		properties.load(fis);
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}

	public String getEmailId() {return properties.getProperty("emailID");}
	
	public String getpassword() {return properties.getProperty("password");}
	
	public String getAutomationName() {return properties.getProperty("automationName");}
	
	public String getPlatformName() {return properties.getProperty("platformName");}
	
	public String getPlatformVersion() {return properties.getProperty("platformVersion");}
	
	public String getDeviceName() {return properties.getProperty("deviceName");}
	
	public String getAppPackage() {return properties.getProperty("appPackage");}
	
	public String getAppActivity() {return properties.getProperty("appActivity");}
	
	public String gethubURL() {return properties.getProperty("hubURL");}
	
	


}
