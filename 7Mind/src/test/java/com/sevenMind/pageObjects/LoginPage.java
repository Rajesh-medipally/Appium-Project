package com.sevenMind.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sevenMind.utilities.Utils;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	WebElement emailField;
	
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	WebElement paswordField;
	
	public WebElement getEmailField() {
		Utils.waitForVisibility(emailField, driver);
		return emailField;
	}
	
	public void enterEmailField(String email) {
		Utils.waitForVisibility(emailField, driver);
		emailField.sendKeys(email);
	}
	

	public WebElement getPasswordField() {
		Utils.waitForVisibility(paswordField, driver);
		return paswordField;
	}
	


	public void enterPasswordField(String name) {
		Utils.waitForVisibility(paswordField, driver);
		paswordField.sendKeys(name);
	}
	
	
}
