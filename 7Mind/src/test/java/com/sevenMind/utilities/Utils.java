package com.sevenMind.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class Utils {

	
	public static void Wait(AppiumDriver driver,int secounds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secounds));
		
	}
	
	public static void waitForVisibility(WebElement element , WebDriver driver){
		 new WebDriverWait(driver,Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(element));
	}
	
}
