package com.sevenMind.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sevenMind.utilities.Utils;

public class RegisterOptionsPage {

	WebDriver driver;

	public RegisterOptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.Button")
	WebElement emailButton;

	
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.Button")
	WebElement facebookButton;

	public WebElement getEmailButton() {
		Utils.waitForVisibility(emailButton, driver);
		return emailButton;
	}


	public WebElement getFacebookButton() {
		Utils.waitForVisibility(facebookButton, driver);

		return facebookButton;
	}


	public void clickEmailButton() {
		Utils.waitForVisibility(emailButton, driver);

		emailButton.click();;
	}


	public void clickFacebookButton() {
		Utils.waitForVisibility(facebookButton, driver);

		facebookButton.click();;
	}

	
}
