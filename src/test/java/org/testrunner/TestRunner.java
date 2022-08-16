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
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, strict = true,snippets=SnippetType.CAMELCASE, 
plugin= {"html:C:\\Users\\ELCOT\\eclipse-workspace\\ProperCucumber\\All Report\\html",
		"json:C:\\Users\\ELCOT\\eclipse-workspace\\ProperCucumber\\All Report\\json\\fb.json",
		"junit:C:\\Users\\ELCOT\\eclipse-workspace\\ProperCucumber\\All Report\\junit\\face.xml",
		"rerun:C:\\Users\\ELCOT\\eclipse-workspace\\ProperCucumber\\Rerun Failed Scenario\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void reports() {
generateReports.report(System.getProperty("user.dir")+"\\All Report\\json\\fb.json");
	}
}
