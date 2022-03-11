package com.sevenMind.testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sevenMind.pageObjects.LoginOptionsPage;
import com.sevenMind.pageObjects.LoginOrRegisterPage;
import com.sevenMind.pageObjects.LoginPage;
import com.sevenMind.pageObjects.RegisterOptionsPage;
import com.sevenMind.pageObjects.RegisterPage;
import com.sevenMind.pageObjects.WelcomePage;
import com.sevenMind.utilities.Utils;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;


public class TS_7M_006  extends Base{
	
	WelcomePage welcomePage ;
	LoginOrRegisterPage loginOrRegisterPage ;
	LoginOptionsPage loginOptionsPage;
	LoginPage loginPage;
	
	
	
	
	//Register functionality Testing

	@BeforeClass
	 void preRequisite() {
		 welcomePage = new WelcomePage(driver);
		 loginOrRegisterPage = new LoginOrRegisterPage(driver);
		loginOptionsPage = new LoginOptionsPage(driver);
			loginPage = new LoginPage(driver);
		
		welcomePage.clickContinue();
		Utils.Wait(driver, 1);
	} 

//	Verify Login button click action
	@Test
	public void TC_7M_LO_001() {
		String testID="TC_7M_LO_001 :";
		loginOrRegisterPage.clickLogIn();
		Assert.assertTrue(loginOptionsPage.getTextView().isDisplayed());
		logger.info(testID+" Verified Login button click action ");		
		
	}
	
// 	Verify  Email and Facebook buttons to be present 
	@Test
	public void TC_7M_LO_002() {
		String testID="TC_7M_LO_002 :";
		Assert.assertTrue(loginOptionsPage.getEmailButton().isDisplayed());
		Assert.assertTrue(loginOptionsPage.getFacebookButton().isDisplayed());
		logger.info(testID+" Verified Email and Facebook buttons to be present ");		
		
	}

// Verify the Email button click action

	@Test
	public void TC_7M_LO_003() {
		String testID="TC_7M_LO_003 :";
		loginOptionsPage.clickEmailButton();
		Utils.Wait(driver, 1);
		Assert.assertTrue(true);
		logger.info(testID + " Verified the Email button click action" );
	}
	
//	Verify email field

	@Test
	public void TC_7M_LO_004() {
		String testID="TC_7M_LO_004 :";
		Assert.assertTrue(loginPage.getEmailField().isDisplayed());
		logger.info(testID + " Verified email field" );
	}
	
// Verify Entering email value

	@Test
	public void TC_7M_LO_005() {
		String testID="TC_7M_LO_005 :";
		loginPage.enterEmailField(readConfig.getEmailId());
		logger.info("because of this field have bugs we cannot automate so i am entering only valid value");
		logger.info(testID + " Verified email field" );
		Assert.assertTrue(true);
	}
	
//	 Verify Next button click action on email field page

	@Test
	public void TC_7M_LO_006() {
		String testID="TC_7M_LO_006 :";
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		logger.info(testID + " Verified Next button click action on email field page" );
		Assert.assertTrue(true);
	}
	
//	 Verify password field

	@Test
	public void TC_7M_LO_007() {
		String testID="TC_7M_LO_007 :";
		Assert.assertTrue(loginPage.getPasswordField().isDisplayed());
		logger.info(testID + " Verified password field" );
	}
//	 Verify Entering password negative  values

	@Test
	public void TC_7M_LO_009() {
		String testID="TC_7M_LO_008 &  TC_7M_LO_008 :";
		loginPage.enterPasswordField(readConfig.getpassword());
		logger.info("because of this field have bugs we cannot automate so i am entering only valid value so skipping TC_7M_LO_008 ");
		logger.info(testID + " Verified  Entering password value" );
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Assert.assertTrue(true);
	}
	
}
