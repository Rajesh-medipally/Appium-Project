package com.sevenMind.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sevenMind.utilities.Utils;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH ,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"
			+ "")
	WebElement nameField;
	
	@FindBy(how = How.XPATH ,using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView")
	WebElement showText;
	
	@FindBy(how=How.XPATH,using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	WebElement emailField;
	
	
	@FindBy(how=How.XPATH,using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	WebElement paswordField;
	
	public WebElement getShowText() {
		Utils.waitForVisibility(showText, driver);
		return showText;
	}
	public WebElement getNameField() {
		Utils.waitForVisibility(nameField, driver);
		return nameField;
	}
	
	public WebElement getEmailField() {
		Utils.waitForVisibility(emailField, driver);
		return emailField;
	}
	
	public WebElement getPasswordField() {
		Utils.waitForVisibility(paswordField, driver);
		return paswordField;
	}
	
	
	
	public void enterNameField(String name) {
		Utils.waitForVisibility(nameField, driver);
		nameField.sendKeys(name);
	}
	
	public void enterEmailField(String email) {
		Utils.waitForVisibility(emailField, driver);
		emailField.sendKeys(email);
	}
	

	public void enterPasswordField(String name) {
		Utils.waitForVisibility(paswordField, driver);
		paswordField.sendKeys(name);
	}
	

}
