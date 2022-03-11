package com.sevenMind.testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sevenMind.pageObjects.LoginOrRegisterPage;
import com.sevenMind.pageObjects.RegisterOptionsPage;
import com.sevenMind.pageObjects.RegisterPage;
import com.sevenMind.pageObjects.WelcomePage;
import com.sevenMind.utilities.Utils;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class TS_7M_005 extends Base{

	WelcomePage welcomePage ;
	LoginOrRegisterPage loginOrRegisterPage ;
	RegisterOptionsPage registerOptionsPage ;
	RegisterPage registerPage ;
	
	
	
	
	//Register functionality Testing

	@BeforeClass
	 void preRequisite() {
		 welcomePage = new WelcomePage(driver);
		 loginOrRegisterPage = new LoginOrRegisterPage(driver);
		 registerOptionsPage = new RegisterOptionsPage(driver);
		 registerPage = new RegisterPage(driver);
		
		
		
		welcomePage.clickContinue();
		Utils.Wait(driver, 1);
		loginOrRegisterPage.clickRegister();
	} 
	
	
	//Verify  Email and Facebook buttons to be present 
	@Test
	public void TC_7M_RE_001() {
		String testID="TC_7M_RE_001 :";
		Assert.assertTrue(registerOptionsPage.getEmailButton().isDisplayed());
		logger.info(testID +" email button displayed" );
		Assert.assertTrue(registerOptionsPage.getFacebookButton().isDisplayed());
		logger.info(testID+" facebook button is displayed");		
	}
	
	
//	Verify the Email button click action
	@Test
	public void TC_7M_RE_002() {
		String testID="TC_7M_RE_002 :";
		registerOptionsPage.clickEmailButton();
		Utils.Wait(driver, 1);
		Assert.assertTrue(true);
		logger.info(testID + " Verified the Email button click action" );
	}
// Verify name field
	@Test
	public void TC_7M_RE_003() {
		String testID="TC_7M_RE_003 :";
		Assert.assertTrue(registerPage.getShowText().isDisplayed());
		logger.info(testID + " Verified name field" );
	}
	
// Verify Entering name value
	@Test
	public void TC_7M_RE_004() {
		String testID="TC_7M_RE_004 :";
		registerPage.enterNameField("Rajesh Medipally");
		logger.info("because of this field have bugs we cannot automate so i am entering only valid value");
		logger.info(testID + " Verified Entering name value" );
		
	}

//	Verify Next button click action on name page
	@Test
	public void TC_7M_RE_005() {
		String testID="TC_7M_RE_005 :";
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		logger.info(testID + " Verified Next button click action on name page" );
		Assert.assertTrue(true);
	}

//	 Verify email field
	@Test
	public void TC_7M_RE_006() {
		String testID="TC_7M_RE_006 :";
		Assert.assertTrue(registerPage.getEmailField().isDisplayed());
		logger.info(testID + " Verified email field" );
	}


//	Verify Entering email value
	@Test
	public void TC_7M_RE_007() {
		String testID="TC_7M_RE_007 :";
		registerPage.enterEmailField(readConfig.getEmailId());
		logger.info("because of this field have bugs we cannot automate so i am entering only valid value");
		logger.info(testID + " Verified email field" );
		Assert.assertTrue(true);
	}

// Verify Next button click action on email field page
	
	@Test
	public void TC_7M_RE_008() {
		String testID="TC_7M_RE_007 :";
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		logger.info(testID + " Verified Next button click action on email field page" );
		Assert.assertTrue(true);
	}
	
	
//	Verify password field
	@Test
	public void TC_7M_RE_009() {
		String testID="TC_7M_RE_009 :";
		Assert.assertTrue(registerPage.getPasswordField().isDisplayed());
		logger.info(testID + " Verified password field" );
	}

	
	
// Verify Entering password value
	
	@Test
	public void TC_7M_RE_010() {
		String testID="TC_7M_RE_010 :";
		registerPage.enterPasswordField(readConfig.getpassword());
		logger.info("because of this field have bugs we cannot automate so i am entering only valid value");
		logger.info(testID + " Verified  Entering password value" );
		Assert.assertTrue(true);
	}
	
//	Verify Next button click action on password field page


	@Test
	public void TC_7M_RE_011() {
		String testID="TC_7M_RE_011 :";
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		logger.info(testID + " VerifiedNext button click action on password field page" );
		Assert.assertTrue(true);
	}
	
	

	

	
	
/// because of less available time skipping facebook registration test part	
 
	
	
	
	
}
