package com.ajio;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ajio.basefuntions.Reusable;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	@Before
	public void launchingBrowser(Scenario scenario) {
		Reusable.browserLaunch();
		final byte[] source= ((TakesScreenshot) Reusable.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
	}
	
	@After
	public void closingBrowser(Scenario scenario) {
		final byte[] source= ((TakesScreenshot) Reusable.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
		//Reusable.browserQuit();
		
	}
}
