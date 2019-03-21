package com.qa.BusinessComponants;

import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.qa.SupportLibrary.webDriverUtil;
import com.qa.objectRepository.citySearchResultPage;

public class citySearchResultComp extends webDriverUtil{
	
	citySearchResultPage citySearchResultpage;
	
	public citySearchResultComp(WebDriver driver) {
		super(driver);
		citySearchResultpage=new citySearchResultPage(this.driver);
		// TODO Auto-generated constructor stub
	}

	public void clickValidCityOuyput(ExtentTest childTest) {
		try {
			hardWait();
			stopFlow(2);
			if(explicitWaitforElementClickable(citySearchResultpage.get_actualCityFound())) {
				//clickObject(citySearchResultpage.get_actualCityFound());
				clickElementUsingJavaScript(citySearchResultpage.get_actualCityFound());
				logEvent.info("Successfully clicked on valid city output");
				childTest.log(Status.PASS, MarkupHelper.createLabel("Successfully clicked on valid city output", ExtentColor.GREEN));
			}
			
			else {
				logEvent.error("could not able to clicked on valid city output");
				childTest.log(Status.FAIL, MarkupHelper.createLabel("could not able to clicked on valid city output", ExtentColor.RED));
			}
			hardWait();
			stopFlow(2);
		} catch (Exception e) {
			logEvent.fatal(e.toString());
			childTest.log(Status.FAIL, e.toString());
		}
	}
}
