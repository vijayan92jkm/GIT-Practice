package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksPack extends BaseClass {
@Before
public void before() {
	launchBrowser();
	maxBrowser();

}
@After
public void after(Scenario f) {
	//mime type ----> image format
	if (f.isFailed()) {
		TakesScreenshot t = (TakesScreenshot)driver;
		byte[] screen = t.getScreenshotAs(OutputType.BYTES);
	f.embed(screen, "image/png");
		
		
	}
	
	// will Pass Screen Shot Logic
toQuit();
}

}
