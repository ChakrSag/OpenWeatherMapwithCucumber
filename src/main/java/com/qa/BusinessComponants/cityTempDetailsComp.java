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
import com.qa.objectRepository.cityTempDetailsPage;

public class cityTempDetailsComp extends webDriverUtil{
	
	cityTempDetailsPage cityTempDetailspage;
	
	public cityTempDetailsComp(WebDriver driver) {
		super(driver);
		cityTempDetailspage=new cityTempDetailsPage(this.driver);
		// TODO Auto-generated constructor stub
	}

}
