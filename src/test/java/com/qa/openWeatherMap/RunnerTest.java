package com.qa.openWeatherMap;

//import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import com.qa.browserSelector.selectBrowser;
import com.qa.Reporting.*;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.BeforeStep;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/java/com/qa/features/" }, glue = {
		"com.qa.StepDefinitions" }, monochrome = true, tags = {}, 
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html", "com.qa.Reporting.CustomFormatter" }, strict = true)


public class RunnerTest extends AbstractTestNGCucumberTests{

	 
}
