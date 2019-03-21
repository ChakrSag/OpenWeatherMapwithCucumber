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


public class homeSteps extends selectBrowser{

private static boolean initialized = false;
	
	@Before  
	public static void setUp(Scenario scenario) throws Exception{
		if (!initialized) {
	         // Init context. Run just once before first scenario starts
			suiteName = reusableLibrary.featrNmeReportCreatn(scenario.getId());
			reportDirectoryCheck=ExtentManagerAssociateFunctions.createDirectory(System.getProperty("user.dir") +"/Reports/Reports__"+ExtentManagerAssociateFunctions.getCurrentDate());
			String fileName=reportDirectoryCheck+"\\"+suiteName+"__"+ExtentManagerAssociateFunctions.getCurrentDateandTime()+".html";
			extent =ExtentManager.createInstance(fileName);
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Host Name", "CI");
	         Runtime.getRuntime().addShutdownHook(new Thread() {
	            @Override
	            public void run() {
	            	extent.flush();
	            	
	            }
	         });
	         initialized = true;
	      }

		scenarioName=reusableLibrary.scenarioNameforTData(scenario.getName());
		parentTest = extent.createTest(scenario.getName());
			
	}
	
	@Given("^User launches OpenWeatherMap website in desired \"([^\"]*)\"$")
	public void user_launches_OpenWeatherMap_website_in_desired(String browser) throws Exception {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				driver=getBrowser(browser);
				driver.get(dataReadFromPropertyFile.readData("url"));
				Assert.assertTrue(wutil.validateElement(homepage.get_openWeatherMapImg()));
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
	
	@When("^User provides an invalid city input$")
	public void user_provides_an_invalid_city_input() throws Exception {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				homecomp.provideInvalidCityInput(childTest);
				Assert.assertTrue(wutil.validateElement(homepage.get_openWeatherMapImg()));
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
	
	@When("^User provides a valid city input$")
	public void user_provides_a_valid_city_input() throws Exception {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				homecomp.provideValidCityInput(scenarioName, childTest);
				Assert.assertTrue(wutil.validateElement(homepage.get_openWeatherMapImg()));
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
	
	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Exception {
		StepDefinitionMatch match = ThreadLocalStepDefinitionMatch.get();
		childTest=parentTest.createNode(match.getStepName());
		if(!nextsteptobeSkipped) {
			try {
				homecomp.clickSearchButton(childTest);
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
	
	
	
	@After
	public void tearDown(Scenario scenario) {
		if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
		
		nextsteptobeSkipped=false;
	}
}
