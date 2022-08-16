package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassPojo extends BaseClass {
	public ForgottenPassPojo() {
		// Page Factory to avoid scale element exception , init elements---> reintiate
		// elements
		PageFactory.initElements(driver, this);
		// to get locator for forgotten password it shows link in DOM structure sho we
		// take text as a locator //attributename[text()='value']
	}

	@FindBy(xpath = "//a[text()='Forgotten password']")
	private WebElement btnFrgtPass;
	@FindBy(xpath = "//input[@placeholder='Email address or mobile number']")
	private WebElement textSearchBox;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btnSearch;

	public WebElement getBtnFrgtPass() {
		return btnFrgtPass;
	}

	public WebElement getTextSearchBox() {
		return textSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

}
