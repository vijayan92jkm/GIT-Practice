package org.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.pom.ForgottenPassPojo;
import org.pom.LoginPojo;
import org.testng.xml.LaunchSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnitionFile extends BaseClass {

	public static LoginPojo p1;
	public static ForgottenPassPojo p2;

	@Given("User Have To Open Google Chrome and Open face book page")
	public void userHaveToOpenGoogleChromeAndOpenFaceBookPage() {
		loadUrl("https://www.facebook.com/");

	}

	@When("User provide Valid User name and Valid Password")
	public void userProvideValidUserNameAndValidPassword(io.cucumber.datatable.DataTable d) {
		p1 = new LoginPojo();
		List<String> asList = d.asList();
		String loginId = asList.get(2);
		String pass = asList.get(3);

		datafill(p1.getTxtEmail(), loginId);
		datafill(p1.getTxtPass(), pass);
	}

	@When("User Click the Login button")
	public void userClickTheLoginButton() {
		buttonClick(p1.getBtnLogin());
	}

	@Then("User Should Be logged in")
	public void userShouldBeLoggedIn() {
		getPageUrl();
	}

	@When("User Provide invalid User name and invalid password")
	public void userProvideInvalidUserNameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		p1 = new LoginPojo();
		
		List<List<String>> asLists = d.asLists();
		String loginId = asLists.get(1).get(1);
		String pass = asLists.get(2).get(2);
		datafill(p1.getTxtEmail(), loginId);
		datafill(p1.getTxtPass(), pass);
	}

	@Then("User Should be Navigate to invalid credentials page")
	public void userShouldBeNavigateToInvalidCredentialsPage() {
		getPageUrl();

	}

	@Given("User have to open google chrome and launch facebook page")
	public void userHaveToOpenGoogleChromeAndLaunchFacebookPage() {
		loadUrl("https://www.facebook.com/");
	}

	@When("User have click forgotten password Lable")
	public void userHaveClickForgottenPasswordLable() {
		p2 = new ForgottenPassPojo();
		buttonClick(p2.getBtnFrgtPass());
	}

	@When("User have click email text box")
	public void userHaveClickEmailTextBox(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String mail = asList.get(0);
		datafill(p2.getTextSearchBox(), mail);

	}

	@When("User have to click search button")
	public void userHaveToClickSearchButton() {
		buttonClick(p2.getBtnSearch());

	}

	@Then("User should be navigate to reset password page")
	public void userShouldBeNavigateToResetPasswordPage() {
		getPage();

	}

}
