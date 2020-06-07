package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[@id='email']")
	WebElement userEmail;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement userPassword;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginBtn;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userLogin(){
		userEmail.clear();
		userEmail.sendKeys("zeshinanaaz");
		userPassword.clear();
		userPassword.sendKeys("Milton$132");
		loginBtn.click();
	}
	

	


	
	
	
	
	
	

}
