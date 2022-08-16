package org.testrunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.generateReports;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun Failed Scenario\\failed.txt", glue = "org.stepdefinition", 
plugin= {"rerun:C:\\Users\\ELCOT\\eclipse-workspace\\ProperCucumber\\Rerun Failed Scenario\\failed.txt"})
public class TestReRunner {
	@AfterClass
	public static void reports() {
generateReports.report(System.getProperty("user.dir")+"\\All Report\\json\\fb.json");
	}

}
