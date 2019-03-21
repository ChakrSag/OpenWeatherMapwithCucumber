package com.qa.StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import com.qa.SupportLibrary.reusableLibrary;
import com.qa.browserSelector.selectBrowser;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.StepDefinitionMatch;
import junit.framework.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.mysql.jdbc.AssertionFailedException;
import com.qa.Reporting.ExtentManager;
import com.qa.Reporting.ExtentManagerAssociateFunctions;
import com.qa.Reporting.ThreadLocalStepDefinitionMatch;

public class citySearchResultSteps extends selectBrowser{

	@Then("^No Weather should be found$")
	public void no_Weather_should_be_found() throws Exception {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				Assert.assertTrue(wutil.validateElement(citySearchResultpage.get_cityNotFoundError()));
				getResult(match.getStepName(), dataReadFromPropertyFile.readData("Passed"));
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				getResult(match.getStepName(), dataReadFromPropertyFile.readData("Failed"));
				nextsteptobeSkipped=true;
			}
		}
		else {
			getResult(match.getStepName(), dataReadFromPropertyFile.readData("Skipped"));
		}
	}
	
	@Then("^Proper city details should be found$")
	public void proper_weather_details_should_be_found() throws Throwable {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				Assert.assertTrue(wutil.validateElement(citySearchResultpage.get_actualCityFound()));
				getResult(match.getStepName(), dataReadFromPropertyFile.readData("Passed"));
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				getResult(match.getStepName(), dataReadFromPropertyFile.readData("Failed"));
				nextsteptobeSkipped=true;
			}
		}
		else {
			getResult(match.getStepName(), dataReadFromPropertyFile.readData("Skipped"));
		}
	}
}
