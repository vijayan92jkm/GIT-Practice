package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
		// 1. To Maintain Locators in pojo Class first we have to Create Constructor
	public LoginPojo() {
		
		// 2. PageFactory to handle scale not found exceptions & initElements for to reinitiate conditions
		
		PageFactory.initElements(driver, this);
	}

		// 3.Store the locators for user credentials values
	@FindBy(id = "email")
	private WebElement txtEmail;
	@FindBy(id ="pass")
	private WebElement txtPass;
	@FindBy(name = "login")
	private WebElement btnLogin;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
