package com.qa.BusinessComponants;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.qa.SupportLibrary.reusableLibrary;
import com.qa.SupportLibrary.webDriverUtil;
import com.qa.objectRepository.homePage;
import cucumber.api.DataTable;

public class homeComp extends webDriverUtil{
	
	homePage homepage;
	
	public homeComp(WebDriver driver) {
		super(driver);
		homepage=new homePage(this.driver);
		// TODO Auto-generated constructor stub
	}
	
	public void provideInvalidCityInput(ExtentTest childTest) {
		try {
			hardWait();
			stopFlow(2);
			if(explicitWaitforElementClickable(homepage.get_searchBoxforCityEntry())) {
				homepage.get_searchBoxforCityEntry().sendKeys(reusableLibrary.getAlphaNumericString(5));
				logEvent.info("Successfully entered invalid city");
				childTest.log(Status.PASS, MarkupHelper.createLabel("Successfully entered invalid city", ExtentColor.GREEN));
			}
			
			else {
				logEvent.error("could not able to enter invalid city");
				childTest.log(Status.FAIL, MarkupHelper.createLabel("could not able to enter invalid city", ExtentColor.RED));
			}
			hardWait();
			stopFlow(2);
		} catch (Exception e) {
			logEvent.fatal(e.toString());
			childTest.log(Status.FAIL, e.toString());
		}
	}
	
	public void provideValidCityInput(String scenarioName, ExtentTest childTest) {
		try {
			hardWait();
			stopFlow(2);
			if(explicitWaitforElementClickable(homepage.get_searchBoxforCityEntry())) {
				homepage.get_searchBoxforCityEntry().sendKeys(testData.getCommonDataUsingjSON(scenarioName, "validCity"));
				logEvent.info("Successfully entered valid city");
				childTest.log(Status.PASS, MarkupHelper.createLabel("Successfully entered valid city", ExtentColor.GREEN));
			}
			
			else {
				logEvent.error("could not able to enter valid city");
				childTest.log(Status.FAIL, MarkupHelper.createLabel("could not able to enter valid city", ExtentColor.RED));
			}
			hardWait();
			stopFlow(2);
		} catch (Exception e) {
			logEvent.fatal(e.toString());
			childTest.log(Status.FAIL, e.toString());
		}
	}
	
	public void clickSearchButton(ExtentTest childTest) {
		try {
			hardWait();
			stopFlow(2);
			if(explicitWaitforElementClickable(homepage.get_searchButtonForCity())) {
				clickObject(homepage.get_searchButtonForCity());
				logEvent.info("Successfully searched with invalid city");
				childTest.log(Status.PASS, MarkupHelper.createLabel("Successfully searched with invalid city", ExtentColor.GREEN));
			}
			
			else {
				logEvent.error("could not able to searched with invalid city");
				childTest.log(Status.FAIL, MarkupHelper.createLabel("could not able to searched with invalid city", ExtentColor.RED));
			}
			hardWait();
			stopFlow(2);
		} catch (Exception e) {
			logEvent.fatal(e.toString());
			childTest.log(Status.FAIL, e.toString());
		}
	}
}
