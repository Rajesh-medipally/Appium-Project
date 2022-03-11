package com.sevenMind.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sevenMind.utilities.Utils;

public class WelcomePage {

	WebDriver driver;

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.Button")
//	@FindBy(how = How.XPATH ,using="//*[@Id = 'de.sevenmind.android:id/actionButton']//*[@Class= 'android.widget.Button']//*[@text()='CONTINUE']")	
	WebElement continueButton;

	
	public void clickContinue() {
		Utils.waitForVisibility(continueButton, driver);
		continueButton.click();
	} 
   
}
